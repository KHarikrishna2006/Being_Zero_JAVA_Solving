class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int rc=0;
         for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                rc++;
            } else { 
                               break;
            }
    }
        return rc;
    }
}
