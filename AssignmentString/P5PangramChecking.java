// WAP to implement pangram checking with least inbuilt methods being used.
public class P5PangramChecking {
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
                char ch1 = (char) (ch - 'A' + 'a');
                ans = ans + ch1;
            } else {
                ans = ans + ch;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "THE QUICK BROWN Fox Jumps Over Lazy Dog";
        str = removeSpace(str);
        if (str.length() < 26) {
            System.out.println("Given String is not a pangram.");
        } else {
            str = lowerCase(str);

            char a[] = new char[str.length()];

            for (int i = 0; i < str.length(); i++) {
                a[i] = str.charAt(i);
            }

            int check[] = new int[26];

            for (int i = 0; i < a.length; i++) {
                check[a[i] - 97]++; //a 97
            }

            for (int i = 0; i < 26; i++) {
                if (check[i] == 0) {
                    System.out.println("Given string is not a pangram.");
                    break;
                }
            }

            System.out.println("Given string is a pangram.");
        }

    }
}
