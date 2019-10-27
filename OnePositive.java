import java.util.Scanner;

/*
Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).

Otherwise, it should print false.
*/

class OnePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
		int count = 0;
		
		int [] arrNum = {firstNum,secondNum,thirdNum};
		for (int i = 0; i <= arrNum.length-1; i++){
			if (arrNum[i] < 0 || arrNum[i] == 0){
				count++;} else
				count--;
		}
        System.out.println(count==1);
    }
}

/*
foreach loop
int [] arrNum = {firstNum,secondNum,thirdNum};
		for (int numbers : arrNum){
			if (numbers < 0 || numbers == 0){
				count++;} else
				{count--;}
*/