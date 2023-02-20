import java.util.Arrays;

// WAP to find if string contains all unique characters.
public class P6AllUniqueCharacters {
    public static void main(String[] args) {
        String str="abcdefgh";

        char a[]=str.toCharArray();
        Arrays.sort(a);
        boolean temp=false;
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]){
                temp=true;
                System.out.println("String has duplicate characters.");
                break;
            }
        }
        
        if(!temp){
            System.out.println("String has all unique characters.");
        }
    }
}
