
// WAP to sort a String Alphabetically
public class P9SortString {
    public static void main(String[] args) {
        String str="sachingangwar";
        
        char a[]=str.toCharArray();
        // Sort String
        for(int i=1;i<a.length;i++){
            char min=a[i];
            int j=i-1;
            for(  ;j>=0;j--){
                if(min>=a[j]){
                    break;
                }
                a[j+1]=a[j];
                
            }
            a[j+1]=min;
        }
        System.out.print("After Sorting String : ");
        System.out.println(a);
    }
}
