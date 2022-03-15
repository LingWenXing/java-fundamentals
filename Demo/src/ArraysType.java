import java.util.Arrays;
import java.util.Scanner;

public class ArraysType {
	public static void TwoDimensionArrays() {
		int mark[][] = {{1,2,3,4},{11,22,33,44},{10,20,30,40}};
		System.out.print(Arrays.deepToString(mark));
	}
	public static void TwoDimensionArraysUsingScanner() {
		int marks[] = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		for(int i=0; i<marks.length; i++) {
			marks[i] = scan.nextInt();
		}
		System.out.println("Marks are:");
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//2D Arrays
		int mark[][] = new int[2][5];
		scan = new Scanner(System.in);
		
		for(int i=0; i<mark.length;i++) {            
           for(int j=0; j<mark[i].length;j++) {
        	   System.out.println("Enter the marks of class " + i + " student " + j);
               mark[i][j]=scan.nextInt();
           }
        }
		System.out.println("Student marks: ");
		for(int i=0; i<mark.length;i++) {            
           for(int j=0; j<mark[i].length;j++) {
        	   System.out.println(mark[i][j]);
           }
        }
	}
	public static void TwoDimensionDynamicArrays() {
		//2D Dynamic Arrays
		int marks[][] = new int[3][];
		marks[0]=new int[4];
		marks[1]=new int[2];
		marks[2]=new int[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<marks.length;i++) {            
	       for(int j=0; j<marks[i].length;j++) {
	    	   System.out.println("Enter the marks of class " + i + " student " + j);
	           marks[i][j]=scan.nextInt();
	       }
	    }
		System.out.println("Student marks: ");
		for(int i=0; i<marks.length;i++) {            
	       for(int j=0; j<marks[i].length;j++) {
	    	   System.out.println(marks[i][j]);
	       }
	    }
	}
	
	public static void ThreeDimensionArrays() {
		//3D Arrays
		int marks[][][] = new int[2][2][3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<marks.length;i++) {            
	       for(int j=0; j<marks[i].length;j++) {
	    	   for(int k=0; k<marks[i][j].length;k++) {
	        	   System.out.println("Enter the marks of school " + i + " class " + j + " student " + k);
	               marks[i][j][k]=scan.nextInt();
	           }
	       }
	    }
		System.out.println("Student marks: ");
		for(int i=0; i<marks.length;i++) {            
	       for(int j=0; j<marks[i].length;j++) {
	    	   for(int k=0; k<marks[i][j].length;k++) {
	    		   System.out.println(marks[i][j][k]);
	    	   }
	       }
	    }
	}
	
	public static void ThreeDimensionDynamicArrays() {
		//3D Dynamic Arrays
		int marks[][][] = new int[2][][]; // 2 schools, different number of classes and students
		marks[0]=new int[2][];
		marks[1]=new int[3][]; //classes
		
		marks[0][0]=new int[2];
		marks[0][1]=new int[3];
		marks[1][0]=new int[2];
		marks[1][1]=new int[4];
		marks[1][2]=new int[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<marks.length;i++) {            
	       for(int j=0; j<marks[i].length;j++) {
	    	   for(int k=0; k<marks[i][j].length;k++) {
	        	   System.out.println("Enter the marks of school " + i + " class " + j + " student " + k);
	               marks[i][j][k]=scan.nextInt();
	           }
	       }
	    }
		System.out.println("Student marks: ");
		for(int i=0; i<marks.length;i++) {            
	       for(int j=0; j<marks[i].length;j++) {
	    	   for(int k=0; k<marks[i][j].length;k++) {
	    		   System.out.println(marks[i][j][k]);
	    	   }
	       }
	    }
	}
	
	public static void main(String[] args) {
		TwoDimensionArrays();
		System.out.println();
		TwoDimensionArraysUsingScanner();
		System.out.println();
		TwoDimensionDynamicArrays();
		System.out.println();
		ThreeDimensionArrays();
		System.out.println();
		ThreeDimensionDynamicArrays();
	}
	
	
}
