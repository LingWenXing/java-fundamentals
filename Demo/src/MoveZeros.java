import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// Given an array of integers, write a code to move 
		// all zeros to the end. Also we have to maintain the
		// relative order of the non-zero elements.
	    // E.g. - input {1,0,2,0,3,4,0,5}, output {1,2,3,4,5,0,0,0}
	        int numArray[] = {1,0,2,0,3,4,0,5,0,0};
	        int arr[] = new int[numArray.length];
	        int n = 0;
	        for(int i=0; i<numArray.length; i++) {
	        	if(numArray[i]!=0) {
	        		arr[n]= numArray[i];
	        		n++;
	        	}
	        }
	        while (n < numArray.length) {
	        	arr[n] = 0;
	        	n++;
	        }
	        System.out.println("Moving zeros to the end of array : ");
	        System.out.println(Arrays.toString(numArray));
	        System.out.println(Arrays.toString(arr));
	}

}
