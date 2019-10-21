import java.util.Arrays;

public class Array {

    public static void main(String args[]) {

        int[] numbers = {12, 17, 8, 101, 33}; // initialize the array
        //for(int i=0; i<numbers.length; i++){
			for(int num : numbers){
    	System.out.println(num);
        //System.out.println(Arrays.toString(a));
        }
    }
}
