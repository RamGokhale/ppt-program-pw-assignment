import java.util.Scanner;

public class greternumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        int y=1;
       int  i=1;
        while(i<n){
          int z=x+y;
          System.out.println(z);
          x=y;
          y=z;
          i=i+1;

        }
        
    }
}
