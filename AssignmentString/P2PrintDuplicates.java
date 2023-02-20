// WAP to print Duplicates Characters from string
public class P2PrintDuplicates {
    public static void main(String[] args) {
        String s="beautiful beach beach";
        char a[]=s.toCharArray();
        int n=s.length();

        String ans="";

        for(int i=0;i<n;i++){
            char ch=a[i];
            for(int j=i+1;j<n;j++){
                if(a[j]==ch && ans.indexOf(ch)<0){
                    ans=ans+ch;
                    System.out.print(ch+" ");
                    break;
                }
            }
        }        
    }
}
