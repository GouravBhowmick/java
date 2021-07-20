
public class NthMax {

	public static int max(int[] arr, int n) {

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < arr.length -j-1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			System.out.println();
			for(int k = 0 ; k < arr.length; k++){
				System.out.print(arr[k] + " ");
			}
		}
		return arr[arr.length - n];
	}
	
	public static int min(int[] arr, int n) {

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < arr.length -j-1; i++) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			System.out.println();
			for(int k = 0 ; k < arr.length; k++){
				System.out.print(arr[k] + " ");
			}
		}
		return arr[arr.length - n];
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 7, 8, 10, 14, 11, 55, -1 };
		int n = 2 ;
		int diff = arr.length - n;
		if(n > arr.length/2)
			System.out.println("\n" + min(arr, diff));
		else
			System.out.println("\n" + max(arr, n));
		
	}
}
