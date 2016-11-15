public class LargestElementInArray {
	public static void main(String args[]) {
		int[] a = {5, 334, 10, 67824, 12};
		largestElement(a);
	}

	public static void largestElement(int[] a) {
		int result = 0;
		for(int i=0; i< a.length; i++) {
			if (a[i] > result) {
				result = a[i];
			}
		}
		System.out.println(result);
	}
}

// Probl Stmt: From a given array, find the largest element in it.
// Complexity: O(n)