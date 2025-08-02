package Lab2;
import java.util.Scanner;
public class AlphabetCheck {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter single character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Valid alphabetic character");
        } else {
            System.out.println("Not an alphabetic character");
        }
    }
}

