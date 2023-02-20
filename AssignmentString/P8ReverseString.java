// WAP to reverse a String 
// Input: "PWSKILLS"
// output: "SLLIKSWP"
public class P8ReverseString{
    public static void main(String[] args) {
        String str="PWSKILLS";
        StringBuilder sb=new StringBuilder();
        
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }

        System.out.println("Before reversing : "+str);
        System.out.println("After reversing : "+sb);
    }
}