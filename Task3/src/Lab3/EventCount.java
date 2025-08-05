package Lab3;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.time.Duration;
	import java.util.Scanner;

	public class EventCount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
	        String input = sc.nextLine();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	        LocalDateTime eventDateTime = LocalDateTime.parse(input, formatter);
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        if (eventDateTime.isBefore(currentDateTime)) {
	            System.out.println("The event time has already passed.");
	        } else {
	            Duration duration = Duration.between(currentDateTime, eventDateTime);

	            long totalMinutes = duration.toMinutes();
	            long days = totalMinutes / (24 * 60);
	            long hours = (totalMinutes % (24 * 60)) / 60;
	            long minutes = totalMinutes % 60;

	            System.out.println("Time remaining until event:");
	            System.out.println("\t" + days + " days, " + hours + " hours, and " + minutes + " minutes");
	        }

	        sc.close();
	    }
	}


