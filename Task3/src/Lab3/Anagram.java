package Lab3;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine();

	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();

	        if (str1.length() != str2.length()) {
	            System.out.println("Not Anagrams");
	            return;
	        }

	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println("Anagrams");
	        } else {
	            System.out.println("Not Anagrams");
	        }
	    }
	}


