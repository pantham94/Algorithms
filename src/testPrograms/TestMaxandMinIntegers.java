package testPrograms;
//import java.lang;
public class TestMaxandMinIntegers {

	public static void main(String[] args) {
		int x = Integer.MAX_VALUE;
		System.out.println(x);
		System.out.println(isPowerOfTen(x+10));
	}
	public static boolean isPowerOfTen(int x) {
		while(x%10==0) {
			x=x/10;
		}
		if(x==1) {
			return true;
		} else {
			return false;
		}
	}

}
