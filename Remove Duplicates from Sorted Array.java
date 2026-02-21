public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
        if(a.size()==0) return 0;
        int i=1,k=1;
        while(i<a.size()){
            if(!(a.get(i).equals(a.get(k-1)))){
                a.set(k,a.get(i));
                i++;k++;
            }
            else{
                i++;
            }
        }
        return k;
	}
}
