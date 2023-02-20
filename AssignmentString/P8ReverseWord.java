// WAP to reverse a sentence while preserving the position
// Input: Think Twice
// output:"kniht eciwt"
public class P8ReverseWord {
    public static void main(String[] args) {
        String str = "Think Twice";
        str = str.toLowerCase();

        StringBuilder result = new StringBuilder();
        String arr[] = str.split(" ");

        for (String s : arr) {

            for (int i = s.length() - 1; i >= 0; i--) {
                result.append(s.charAt(i));
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}
