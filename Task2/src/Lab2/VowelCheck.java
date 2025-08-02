package Lab2;
import java.util.Scanner;
public class VowelCheck {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a single character: ");
	        char ch = sc.next().charAt(0);

	        ch = Character.toLowerCase(ch);

	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            System.out.println("Vowel");
	        } else {
	            System.out.println("Not a vowel");
	        }
	    }
	}

