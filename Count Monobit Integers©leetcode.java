class Solution {
    public int countMonobit(int n) {
        int c=1;
        int i=1;
        while(true){
            if(((1<<i)-1)>n) break;
            c++;
            i++;
        }
        return c;
    }
}©leetcode
