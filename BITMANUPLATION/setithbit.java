public class setithbit {
    public static int ssetithbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static void main(String args[]){
       System.out.println(ssetithbit(10,2));
    }
}
