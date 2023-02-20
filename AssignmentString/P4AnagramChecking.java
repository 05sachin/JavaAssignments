import java.util.Arrays;

// WAP to implement anagram checking least inbuilt methods being used.
public class P4AnagramChecking {
    static String removeSpace(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            ans = ans + str.charAt(i);
        }
        return ans;
    }

    static String lowerCase(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char ch1 = (char)(ch-'A'+'a');
                ans = ans + ch1;
            } else {
                ans = ans + ch;
            }
        }
        return ans;
    }
    static boolean isEquals(char a1[],char a2[]){
        for(int i=0;i<a2.length;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "Mother In Law";
        String str2 = "Hitler Woman";

        str1 = removeSpace(str1);
        str2 = removeSpace(str2);
        
        
        if (str1.length() != str2.length()) {
            System.out.println("Given Strings are not anagram of each other.");
        } else {
     
            str1 = lowerCase(str1);
            str2 = lowerCase(str2);
            

            char a1[] = new char[str1.length()];
            char a2[] = new char[str2.length()];
            for (int i = 0; i < str1.length(); i++) {
                a1[i] = str1.charAt(i);
                a2[i] = str2.charAt(i);
            }

            Arrays.sort(a1);
            Arrays.sort(a2);

            if (isEquals(a1, a2)) {
                
                System.out.println("Given Strings are anagram of each other.");
            } else {
                System.out.println("Given Strings are not anagram of each other.");
            }
        }
    }
}
