/*Sravani Birudukota
 Programming Fundamentals
 Summer 
 Exercise 5
*/
public class binary_search {

	public static void main(String[] args) {
		
		binary_search obj = new binary_search();
		
		obj.search();
	}

	public int search() {
		int arr[] = { 1, 29, 14, 15, 94 };
		int n, i, j, k, pos, temp;
		n = 5;

		for (i = 0; i < (n - 1); i++) {
			pos = i;

			for (j = i + 1; j < n; j++) {
				if (arr[pos] > arr[j])
					pos = j;
			}
			if (pos != i) {
				temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
			}
			for (k = 0; k < n; k++) {
				System.out.println(arr[k]);

			}
			System.out.println("");
		}

		System.out.println("Final sorting:\n");

		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		return 0;
	}
}