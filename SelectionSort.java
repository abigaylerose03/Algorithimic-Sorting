/**
 *
 *
 *
 * @author 		A.R.P
 * @version 	1.0
 * @since 		.17
 */

// this method works by selecting the smallest unsorted item and swapping it with the first element in a loop
public class Mushrooms {

	void selectionSort(int [] ar) {
		for(int i = 0; i < ar.legnth - 1; i++) {
			int min = i
			for (int j = i+1; j < ar.length; j++) 
				if(ar[j] < ar[min]) { min = j };

			int temp = ar[i];
			ar[i] = ar[min]
			ar[min] = temp;

		}
	}






	public static void main(String args[]) {


	}
}

