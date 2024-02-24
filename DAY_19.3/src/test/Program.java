package test;

public class Program {

	public static int getHashCode(int number) { // Hash function /method
		final int PRIME = 31;
		int result = 1;
		result = result * number + PRIME * number;
		return result;
	}

	public static void main(String[] args) {
		int[] arr = new int[5];

		int a = 11;
		int hashCode = Program.getHashCode(a); // 352
		int slot = hashCode % 5; // 2
		System.out.println(a + "  :  " + hashCode + "  " + slot);

		int b = 15;
		hashCode = Program.getHashCode(b); // 352
		slot = hashCode % 5; // 2
		System.out.println(b + "  :  " + hashCode + "  " + slot);

	}

	public static void main2(String[] args) {
		int[] arr = new int[5];

		int number = 11;
		int hashCode = Program.getHashCode(number); // 352
		int slot = hashCode % 5; // 2

		arr[slot] = number;
		System.out.println(number + "  :  " + hashCode + "  " + slot);

	}

	public static int linearSearch(int[] arr, int key) {
		for (int index = 0; index <= arr.length; ++index) {
			if (arr[index] == key)
				return index;
		}
		return -1;
	}

	// 10,20,30,40,50

	public static int binSearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (key == arr[mid])
				return mid;
			else if (key > arr[mid])
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	public static void main1(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int index = Program.linearSearch(arr, 10);
		System.out.println(index);
	}
}
