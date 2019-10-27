import java.util.Scanner;

class NextEvenNumber {
	
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
		int nextEven = (inputNumber/2 + 1) * 2;

        System.out.println(nextEven);
    }
}