package Sample;

import java.util.Arrays;

public class Compare_2_integer_array {
	public static void main(String[] args) {
		
		int arr1[]= {34,56,45};
		int arr2[]= {23,56,33};
		int arr3[]= {34,56,45};
		
		System.out.println(Arrays.equals(arr1,arr2));
		System.out.println(Arrays.equals(arr2, arr3));
		System.out.println(Arrays.equals(arr1, arr3));
	}
}
