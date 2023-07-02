import java.util.Scanner;

public class greternumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of number");
       int n=sc.nextInt();
       if(n==0){
           System.out.println("the number is zero");
       }
       if(n>0){
           System.out.println("the number is postive");
       }
       else{
           System.out.println("the number is negative");
       }
    }
}
