package chapter03;

import java.util.Arrays;

public class ArrayUtil {
	public static void main(String[] args) {
		int[] a1 = {0, 1, 2, 3, 4};
		double[] d1 = ArrayUtil.intToDouble(a1);//로직우선구현
		System.out.println(Arrays.toString(d1));
		
	}
}
