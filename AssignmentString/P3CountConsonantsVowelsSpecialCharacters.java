// WAP to count the number of consonants ,vowels,special characters in a string.
public class P3CountConsonantsVowelsSpecialCharacters {
    public static void main(String[] args) {
        String str="Hello,Sachin Gangwar 123";
        int consonants=0 ,vowels=0 ,SpecialCharacters=0 ,digits=0;

        for(int i=0;i<str.length();i++){
            
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'){

                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                    vowels++;
                }else{
                    consonants++;
                }
            }else if(ch>='0'&&ch<='9'){
                digits++;
            }else{
                SpecialCharacters++;
            }
        }

        System.out.println("Count of consonatns: "+consonants);
        System.out.println("Count of vowels: "+vowels);
        System.out.println("Count of digits: "+digits);
        System.out.println("Count of SpecialCharacters: "+SpecialCharacters);
        
    }
}
