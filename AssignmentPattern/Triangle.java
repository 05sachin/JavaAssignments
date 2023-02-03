// Write a program to print triangle using star pattern programming logic.
public class Triangle {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            // left triangle
            for(int j=0;j<n;j++){
                if(i==0||j==0||(i+j)<=n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        System.out.println();
        // right triangle
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                if(i==0||j==n-1||(i-j)<=0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
