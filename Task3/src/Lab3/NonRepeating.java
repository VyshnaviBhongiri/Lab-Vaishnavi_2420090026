package Lab3;
import java.util.Scanner;
public class NonRepeating {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (input.indexOf(ch) == input.lastIndexOf(ch)) {
            System.out.println("First non-repeating character: " + ch);
            return;
        }
    }

    System.out.println("No non-repeating character found");
}
}