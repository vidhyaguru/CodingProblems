
public class fib {

	public static void main (String args[]) {
		int i = 4;
		System.out.println(fib(i));
	}

	public static int fib(int i) {
		if(i==0) return 0;
		if(i==1) return 1;
		else return (fib(i-1) + fib(i-2));
	}
}
