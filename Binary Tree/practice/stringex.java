public class stringex {
    public static void main(String args[]){
        String s1="tony";
        String s2="tony";
        String s3=new String("tony");

        if(s1==s2){
            System.out.println("equal");
        }
        else{
            System.out.println("unequal");
        }
        
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println("unequal");
        }

    }
}
