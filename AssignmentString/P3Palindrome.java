// WAP to check if"2552" is palindrome or not.
public class P3Palindrome {
    public static void main(String[] args) {
        String str="2552";

        String rstr=""; 
        //reverse string 
        for(int i=str.length()-1;i>=0;i--){
            rstr=rstr+str.charAt(i);
        }

        if(str.equals(rstr)){
            System.out.println("Given string is a palindrome.");
        }else{
            System.out.println("Given string is not a palindrome.");
        }
    }
}
