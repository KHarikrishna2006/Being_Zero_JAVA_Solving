public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
        if(a.size()<3) return a.size();
        int i=2,k=2;
        while(i<a.size()){
            if(!(a.get(i).equals(a.get(k-2)))){
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
