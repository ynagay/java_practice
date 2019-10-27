import java.util.Scanner;

public class Snail {
	
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        		
		int height = scanner.nextInt();
		int up = scanner.nextInt();
		int down = scanner.nextInt();
		
		int currentPoint = 0;
        int count = 0;

		while (currentPoint + up < height){
		
		count+=1;
		
		currentPoint = currentPoint + up - down;
		} 
		
		count+=1;
		
		//second solution
		/*
		
		count = (height-up)/(up-down) + 1 //if division is round
		count = (height-up)/(up-down) + 2
		*/
	
		
		System.out.println(count);
    }
}