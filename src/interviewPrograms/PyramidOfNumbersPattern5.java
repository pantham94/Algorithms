/*
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
    1 2 3 4 5 6 7 6 5 4 3 2 1 
      1 2 3 4 5 6 5 4 3 2 1 
        1 2 3 4 5 4 3 2 1 
          1 2 3 4 3 2 1 
            1 2 3 2 1 
              1 2 1 
                1 
*/
package interviewPrograms;

public class PyramidOfNumbersPattern5 {

	public static void main(String[] args) {
		pyramid(9);
	}
	public static void pyramid(int value) {
		int rowCount = value;
		for(int i=0;i<value;i++) {
			for(int j=1;j<=i*2;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=rowCount;k++) {
				System.out.print(k+" ");
			}
			for(int k=rowCount-1;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
			rowCount--;
		}
	}
}
