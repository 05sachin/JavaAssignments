// WAP to remove Duplicates from a String .(TAe any string example with duplicates characters)
public class P1RemoveDuplicates{
    public static void main(String[] args) {
        String s="Hello Sachin Gangwar";
        int n=s.length();
        
        String ans="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ans.indexOf(ch)<0){
                ans=ans+ch;
            }
        }
        System.out.println("Before removal: "+s);
        System.out.println("After removal: "+ans);
    }
}