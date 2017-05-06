
import java.util.Scanner;


public class Tables {
    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                int c;
                System.out.println("Enter an integer to print multiplication table ");
                int n =in.nextInt();
                System.out.println(" multiplication of  table"+n+ " is ");
                for (c=1; c<=10 ;c++){
                    System.out.println(n+" * "+c+"="+(n*c));
                }
    }
    
}
