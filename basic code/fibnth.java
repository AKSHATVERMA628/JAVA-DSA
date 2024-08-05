public class fibnth {
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm2=fib(n-2);
        int fnm1=fib(n-1);
        int fn=fnm2+fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n=50;
        System.out.println(fib(n));
    }
}
