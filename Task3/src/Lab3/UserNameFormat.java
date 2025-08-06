package Lab3;

public class UserNameFormat {
	 public static void main(String[] args) {
	        String name = "  rAjEsh ";
	     name= name.trim();
	      name= name.toLowerCase();
	       name= name.replace("a", "@");
	        System.out.println("Formatted Name: " + name);
}
}
