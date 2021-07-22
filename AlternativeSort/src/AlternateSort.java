import java.util.Arrays;

public class AlternateSort {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 4, 1, 9, 7, 5 };
		int size1 = arr.length;
		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		int[] altsort = new int[size1];
		int i = 0, j = size1 - 1, k = 0;
		while (i < j) {
			altsort[k++] = arr[j--];
			altsort[k++] = arr[i++];
		}
		if (size1 % 2 != 0)
			altsort[k] = arr[i];
		System.out.println(Arrays.toString(altsort));
	}

}
