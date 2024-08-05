public class PowerofTwo {
    public static boolean PowerofTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(PowerofTwo(12));
    }
}
