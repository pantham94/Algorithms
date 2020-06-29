package interviewPrograms;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,5,3,7,2,8};
		int[] arr2 = {1,5,3,2,8,7};
		String[] s1 = {"java", "j2ee", "struts", "hibernate"};
		String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
	    String[] s3 = {"java", "j2ee", "struts", "hibernate"};
	    if(Arrays.equals(s1,s2)) {
	    	System.out.println("String arrays are equal");
	    } else {
	    	System.out.println("String arrays are not equal");
	    }
	    String[][] s1d = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        String[][] s2d = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        if(Arrays.deepEquals(s1d,s2d)) {
	    	System.out.println("String arrays are equal");
	    } else {
	    	System.out.println("String arrays are not equal");
	    }
		if(arr1.length!=arr2.length) {
			System.out.println("Arrays are not equal");
			return;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.println("Arrays are not equal");
				return;
			}
		}
		System.out.println("Arrays are equal");
		return;
	}
}
