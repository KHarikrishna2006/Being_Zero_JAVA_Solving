class Solution {
    public double angleClock(int hour, int minutes) {
        double a=Math.abs((double)((hour%12)*30-minutes*5.5));
        return Math.min(a,360-a);
    }
}
