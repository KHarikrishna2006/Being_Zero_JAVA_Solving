

class BeingZero {
        int[] a=new int[46];
    BeingZero(){
        a[0]=1;
        a[1]=1;
        for(int i=2;i<46;i++){
            a[i]=a[i-1]+a[i-2];
        }
    }
    public int countDistinctWays(int nums) {
        return a[nums];
    }
    
}

