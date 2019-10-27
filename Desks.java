import java.util.Scanner;

/*
A university has decided to open math courses and equip classrooms for 3 groups with special new desks. The faculty agreed that in the sake of productivity only two students may share one table. The enrolment has ended, and now the task is to count the number of desks to order the correct amount from the shop. Of course, the university is short of money, so you need to calculate the minimum of desks. But don't forget that each group will sit in its own classroom!

Input data format

The program receives the input of the three non-negative integers: the number of students in each of the three groups (the numbers is not bigger than 1000).

*/
class Desks {
	
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int firstGroup = scanner.nextInt();
		int secondGroup = scanner.nextInt();
		int thirdGroup = scanner.nextInt();
		
		int firstGroupDesks = firstGroup/2 + firstGroup%2; 
		int secondGroupDesks = secondGroup/2 + secondGroup%2; 
		int thirdGroupDesks = thirdGroup/2 + thirdGroup%2; 
		
		int totalGroupCount = firstGroupDesks + secondGroupDesks + thirdGroupDesks;
		
        System.out.println(totalGroupCount);
    }
}