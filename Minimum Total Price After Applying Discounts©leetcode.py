class Solution:
    def minPrice(self, prices: list[int], discounts: list[int]) -> float:
        prices.sort()
        prices=prices[::-1]
        discounts.sort()
        discounts=discounts[::-1]
        print(prices,discounts)
        i=0
        while(i<len(prices) and i<len(discounts)):
            prices[i]=(prices[i]*(100-discounts[i]))/100
            i+=1
        return sum(prices)©leetcode
