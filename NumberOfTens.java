import java.util.Scanner;

class NumberOfTens {
	
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        int result = (inputInt - (inputInt/100) * 100) / 10; 
		//int result = (inputInt%100/10; 
		
        System.out.println(result);
		
    }
}