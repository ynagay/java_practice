import java.util.Arrays;

public class ArrayFill {

    public static void main(String args[]) {

        int[] numbers = new int [10]; // initialize the array
        Arrays.fill(numbers,0,numbers.length/2 , 1);
		Arrays.fill(numbers,numbers.length/2,numbers.length, 2);
    	System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.toString(a));
        
    }
}
