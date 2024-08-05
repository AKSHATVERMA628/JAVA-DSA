public class ClearIBit {
    public static int ClearIBit(int n,int i){
        int bitMask=~(0)<<i;
        return n&bitMask;
    }
    public static void main(String args[]){
        System.out.println(ClearIBit(15,2));
    }
}
