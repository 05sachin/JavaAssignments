// WAP to find the maximum occurring characters in a string.
public class P7MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str="sachingangwar";
        
        int freq[]=new int[256];
        
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }

        int mcount=-1;
        char result =' ';

        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)] > mcount){
                mcount=freq[str.charAt(i)];
                result =str.charAt(i);
            }
        }

        System.out.println(result);

    }
}
