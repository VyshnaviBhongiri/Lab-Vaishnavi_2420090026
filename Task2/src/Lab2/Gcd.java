package Lab2;
import java.util.Scanner;
public class Gcd {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first interval: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter second interval: ");
	        int num2 = sc.nextInt();

	        int gcd = 1;
	        int min = (num1 < num2) ? num1 : num2;

	        for (int i = 1; i <= min; i++) {
	            if (num1 % i == 0 && num2 % i == 0) {
	                gcd = i;
	            }
	        }

	        System.out.println("GCD : " + gcd);
	    }
}
