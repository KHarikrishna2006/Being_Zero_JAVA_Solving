public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
        int i=0,k=0;
            while(i<a.size()){
                if(!(a.get(i).equals(b))){
                    a.set(k,a.get(i));
                    i++;k++;
                }
                else i++;
            }
        return k;
	}
}
