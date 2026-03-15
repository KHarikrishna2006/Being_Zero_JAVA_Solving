class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int n1=num1.length(),n2=num2.length();
        int a=0,b=0,s=0,c=0,d=0;
        while(n1>0 || n2>0 || c>0){
            a=(n1<=0)?0:num1.charAt(n1-1)-'0';
            b=(n2<=0)?0:num2.charAt(n2-1)-'0';
            s=a+b+c;
            d=s%10;
            c=s/10;
            sb.append(d);
            n1--;
            n2--;
        }
        return new String(sb.reverse());
    }
}
