public class FindElementInArray {
	public static void main (String args[]) {
		int[] a = {2, 4, 10, 2, 1, 3};
		int n = 2;
		System.out.println(specificElement(a, n));
	}
	public static int specificElement(int[] a, int n) {
		int out = 0;
		for(int i=0; i<a.length-1; i++) {
			if(a[i]==n){
				return i+1;
			} 
		}
		return out;
	}
}

//Problem Stmt: From an array a, get location of specific value of 10 or 4 or 1
//Complexity: O(n)

