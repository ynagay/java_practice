import java.util.Scanner;

/*
N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.

Input data format

There are two positive integers N and K, each of them is not greater than 10000.
*/

class SquNuts {
	
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int squirrelsCount = scanner.nextInt();
        int nutsCount = scanner.nextInt();
		
		int nutsLeft = nutsCount%squirrelsCount;
        System.out.println(nutsLeft);
    }
}