package Ch06_Object_oriented_Programming;

public class Practice6_17 {
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	} // end of main

	// 1. shuffle 메서드를 작성하세요
	private static int[] shuffle(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			int j = (int) (Math.random() * arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			
		} // end of for i
		return arr;
	}

} // end of class