package interviewPrograms;

public class IsPowerOfTen {

	public static void main(String[] args) {
		System.out.println("100 is a power of ten: "+isPowerOfTen(100));
		System.out.println("1 is a power of ten: "+isPowerOfTen(1));
		System.out.println("0 is a power of ten: "+isPowerOfTen(0));
		System.out.println("Integer.MIN_VALUE is a power of ten: "+isPowerOfTen(Integer.MIN_VALUE));
		System.out.println("Integer.MAX_VALUE is a power of ten: "+isPowerOfTen(Integer.MAX_VALUE));
		System.out.println("Integer.MIN_VALUE-5000 is a power of ten: "+isPowerOfTen(Integer.MIN_VALUE-5000));
		System.out.println("Integer.MAX_VALUE+5000 is a power of ten: "+isPowerOfTen(Integer.MAX_VALUE+5000));
		int max= Integer.MAX_VALUE+3;
		System.out.println("Integer.MAX_VALUE:::"+Integer.MAX_VALUE);
		System.out.println("Integer.MAX_VALUE+2:::::"+max);
		
	}
	public static boolean isPowerOfTen(int input) {
		if(input<=0) {
			System.out.println("Input is less than or equal to 0");
			return false;
		}
		if(input==1) {
			return true;
		}
		if(input%10!=0) {
			return false;
		}
		return isPowerOfTen(input/10);
	}

}
