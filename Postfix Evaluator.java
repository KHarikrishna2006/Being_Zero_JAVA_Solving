import java.util.*;

class BeingZero{
    public Long solve(String exp){
        Long s=0L;
        Stack<Long> st=new Stack<>();
        String[] ss=exp.trim().split(" ");
        for(int i=0;i<ss.length;i++){
            if(!ss[i].equals("+") && !ss[i].equals("-") && !ss[i].equals("*")&& !ss[i].equals("/")){
                    st.push(Long.parseLong(ss[i]));
            }
            else{
                Long a=st.pop();
                Long b=st.pop();
                Long k=0L;
                switch(ss[i]){
                    case "+":k=a+b;break;
                    case "-":k=b-a;break;
                    case "/":k=b/a;break;
                    case "*":k=b*a;break;
                }
                st.push(k);
            }
        }
        s=(Long)st.peek();
        return s;
    }
}
