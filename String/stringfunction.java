public class stringfunction{
    public static void main(String args[]){
        String s1="tony";
        String s2="tony";
        String s3=new String("tony");
        if(s1.equals(s3)){
            System.out.print("strings are equal");
        }
        else{
            System.out.print("strings are not equal");
        }
    }
}