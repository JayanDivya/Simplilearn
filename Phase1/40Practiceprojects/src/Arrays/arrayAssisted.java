package Arrays;
public class arrayAssisted {
		public static void main(String[] args) {
		//single-dimensional array
		int array[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+array[i]);
		}
		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 1 is: " + b[0].length+" and some of elements are "+b[0][1]+" "+b[0][2]);
		      System.out.println("\nLength of row 2 is: " + b[1].length+" and some of elements are "+b[1][2]+" "+b[1][1]);
		      }
		}