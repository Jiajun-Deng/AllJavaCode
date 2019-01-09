public class ArrayDemo{

/** To replace a[i] by the sum of a[i] through a[i+n].
	If a[i] is negative, no change of its value.
	a[i+n] should be a value in the array.*/

	public static void windowPosSum(int[] a, int n){
		for (int i = 0;i < a.length ;i++ ) {
			if (a[i] < 0){
				continue;
			}
			int temp = 0;
			for (int j = 0;j <= n ;j++ ) {

				if (i + j >= a.length) {
					break;
				}
				temp = temp + a[i+j];
			}
			a[i]=temp;
		}
	}

	public static void main(String[] args) {
		int[] a = {1, 2, -3, 4, 5, 4};
		int n = 3;
		windowPosSum(a, n);
		System.out.println(java.util.Arrays.toString(a));
		int [] x = {1, -1, -1, 10, 5, -1};
		windowPosSum(x,2);
		System.out.println(java.util.Arrays.toString(x));
	}
}