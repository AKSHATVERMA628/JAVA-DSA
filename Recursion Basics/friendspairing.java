public class friendspairing {
    public static int friendspairing(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=friendspairing(n-1);
        int fnm2=friendspairing(n-2);
        int pairways=(n-1)*friendspairing(n-2);
        int totalways=pairways+fnm1;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(friendspairing(5));
    }
}
