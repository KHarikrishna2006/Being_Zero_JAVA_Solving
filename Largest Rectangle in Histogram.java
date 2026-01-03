import java.util.*;
class BeingZero{
    public static int[] nsei(int[] a,int n){
        int[] an=new int[n];
        Arrays.fill(an,n);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && a[i]<a[st.peek()]){
                an[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        return an;
    }
    public static int[] psei(int[] a,int n){
        int[] an=new int[n];
        Arrays.fill(an,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && a[i]<a[st.peek()]){
                an[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        return an;
    }
    
    public int solve(int arr[] , int n){
        int[] ns=nsei(arr,n);
        int[] ps=psei(arr,n);
        int m=0;
        for(int i=0;i<n;i++){
            int w=ns[i]-ps[i]-1;
            int x=arr[i]*w;
            m=Math.max(x,m);
        }
        return m;
    }
}
