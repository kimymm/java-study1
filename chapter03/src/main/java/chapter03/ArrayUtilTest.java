package chapter03;

import java.util.Arrays;

public class ArrayUtilTest {
	public static void main(String[] args) {
		int[] a1 = {0,1,2,3,4};
		double[] d1 = ArrayUtil.intToDouble(a1);
		System.out.println(Arrays.toString(d1));
		
		double[] d2 = {0.0, 1.1, 2.2, 3.3};
		int[] a2 = ArrayUtil.doubleToInt(d2);
		System.out.println(Arrays.toString(a2));
		
		int[] a3 = ArrayUtil.concat
	}
}
