import java.util.Scanner;

/*
Write a program that reads a three digit number, calculates the new number by reversing its digits, and outputs a new number.
*/

class Reversing {
	
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
        int threeDigitNumber = scanner.nextInt();
		
		int firstDigit = threeDigitNumber/100;
		int secondDigit = threeDigitNumber%100/10;
		int thirdDigit = threeDigitNumber%10;
		
		int reversNumber = thirdDigit*100+secondDigit*10+firstDigit;
        System.out.println(reversNumber);
    }
}