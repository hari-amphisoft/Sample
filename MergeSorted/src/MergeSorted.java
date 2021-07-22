import java.util.Arrays;

public class MergeSorted {

	public static void main(String[] args) {
		int[] arr1 = { 11, 22, 33, 44 };
		int[] arr2 = { 10, 23, 31, 33, 46, 57 };
		int size1 = arr1.length, size2 = arr2.length;
		System.out.println(size1 + " " + size2);
		int[] arr3 = new int[size1 + size2];

		int i = 0, j = 0, k = 0;

		while (i < size1 && j < size2) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			} else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < size1) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while (j < size2) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}

		System.out.println(Arrays.toString(arr3));

	}

}
