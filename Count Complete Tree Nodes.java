class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t=target;
        char c=' ';
        for(char i:letters){
            int s=i;
            if(s>t){
                c=i;
                break;
            }
        }
        if(c==' ') return letters[0];
        return c;
    }
}
