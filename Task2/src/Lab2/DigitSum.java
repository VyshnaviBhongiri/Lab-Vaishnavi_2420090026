package Lab2;
import java.util.Scanner;
public class DigitSum {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = sc.nextInt();

	        if (number < 0) {
	            number = -number;
	        }

	        int sum = 0;

	        while (number > 0) {
	            sum += number % 10;
	            number = number / 10;
	        }

	        System.out.println("Sum : " + sum);
	    }
	}