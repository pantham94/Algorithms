/*
9
Here Is Your Pyramid
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
*/
package interviewPrograms;

import java.util.Scanner;

public class PyramidOfNumbersPattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for rows of pyramid:");
		int value = scan.nextInt();
		pyramid(value);
	}
	public static void pyramid(int value) {
		int rowCount = 1;
		for(int i=value;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++) {
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}
	}
}
	
	            
	    
	

