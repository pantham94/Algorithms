/*                  9 
                8 9 8 
              7 8 9 8 7 
            6 7 8 9 8 7 6 
          5 6 7 8 9 8 7 6 5 
        4 5 6 7 8 9 8 7 6 5 4 
      3 4 5 6 7 8 9 8 7 6 5 4 3 
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
*/

package interviewPrograms;

public class PyramidOfNumbersPattern6 {

	public static void main(String[] args) {
		pyramid(9);
	}
	public static void pyramid(int value) {
		int rowCount = 1;
		for(int i=value;i>=1;i--) {
			for(int j=1;j<=i*2;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=value;k++) {
				System.out.print(k+" ");
			}
			for(int k=value-1;k>=i;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
			rowCount++;
		}
	}
}
