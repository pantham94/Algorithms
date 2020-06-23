/*
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * *  
*/
package interviewPrograms;

public class PyramidOfNumbersPattern3 {

	public static void main(String[] args) {
		pyramid(10);
	}
	public static void pyramid(int value) {
		int rowCount = 1;
		for(int row=0;row<value;row++) {
			for(int i=value-rowCount;i>0;i--) {
				System.out.print(" ");
			}
			for(int k=0;k<rowCount;k++) {
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
	}
}
