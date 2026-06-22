class Solution {
    public static String ag(String s){
        char[] a=s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> a=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String i:strs){
            String s=ag(i);
            if(!(hm.containsKey(s))){
                hm.put(s,new ArrayList<>());
                // hm.get(s).add(i);
            }
            hm.get(s).add(i);
        }
        for(List<String> aa:hm.values()){
            a.add(aa);
        }
        return a;
    }
}
