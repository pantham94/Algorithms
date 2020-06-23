/*
9
Here Is Your Pyramid
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
*/

package interviewPrograms;
import java.util.Scanner;

public class PyramidOfNumbersPattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for rows of pyramid:");
		int value = scan.nextInt();
		pyramid(value);
	}
	public static void pyramid(int value) {
		for(int i=0;i<value;i++) {
			for(int j=0;j<value-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print(k+1+" ");
			}
			for(int j=0;j<value-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
