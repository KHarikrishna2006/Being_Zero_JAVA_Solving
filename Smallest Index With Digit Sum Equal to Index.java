class Solution {
    public static int getDigitSum(int number) {
    int sum = 0;
    number = Math.abs(number);
    
    while (number > 0) {
        sum += number % 10;
        number /= 10;
    }
    
    return sum;
}
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==getDigitSum(nums[i])) return i;
        }
        return -1;
    }
}
