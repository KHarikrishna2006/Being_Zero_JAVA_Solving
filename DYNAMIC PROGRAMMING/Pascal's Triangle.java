import java.util.*;
import java.io.*;
class BeingZero {
    public List<List<Integer>> solve(int N) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<N;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==j || j==0) a.add(1);
                else a.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            ans.add(a);
        }
        return ans;
    }
}

