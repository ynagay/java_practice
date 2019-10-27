import java.util.Scanner;

/*
Given the values of the two moments in time in the same day: hours, minutes and seconds for each of the time moments. It is known that the second moment in time happened not earlier than the first one. Find how many seconds passed between these two moments of time.

Input data format

The program gets the input of the three integers: hours, minutes, seconds, defining the first moment of time and three integers that define the second moment time.

Output data format

Output the number of seconds between these two moments of time.

*/
class DifferenceOfTime {
	
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int firstHours = scanner.nextInt();
		int firstMinutes = scanner.nextInt();
		int firstSeconds = scanner.nextInt();
		int secondHours = scanner.nextInt();
		int secondMinutes = scanner.nextInt();
		int secondSeconds = scanner.nextInt();
		
		int timeDiffInSec = secondHours*60*60+secondMinutes*60+secondSeconds - (firstHours*60*60+firstMinutes*60+firstSeconds) ;

        System.out.println(timeDiffInSec);
    }
}