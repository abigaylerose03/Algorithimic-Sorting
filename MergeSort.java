public class MyMergeSort {

	private int[] array;
	private int[ tempMergArr;
	private int length;

	public static void main(String[] args) {

		int[] inputArr = {45. 14, 35, 12, 53, 52, 3, 63, 89, 45};
		MymMrgeSort mms = new MyMergeSort();
		mms.sort(inputArr);
		for(int i : inputArr) {
			System.out.println(i + " ");
		}
		
	}

	//  repeatedly merges the partitioned units into sublists 
	//  until there is only one sublist, the sorted numbers, remaining 
	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for(int i = lowerIndex; i <= higherIndex; i ++) {
			tempMergeArr[i] = array[i];
		}

		int lower = lowerIndex;
		int mid = middle + 1;
		int higher = higherIndex; 
		while(lower <= middle && mid <= higherIndex) {
			if(tempMergArr[lower] <= tempMergArr[mid]) {
				array[higher] = tempMergArr[lower];
				lower++;
			} else {
				array[higher] = tempMergArr[mid];
				mid++;
			}
			higher++;
		}
		while(lower <= middle) {
			array[higher] = tempMergArr[lower];
			higher++;
			lower++;
		}
	}

	// performs the logic of the sorting with guaranteed O(n * log(n)) efficiency
	private void doMergeSort(int lowerIndex, int higherIndex) {
		// divides the array 
		if(lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex);
			// sorts left side of the array
			doMergeSort(lowerIndex, middle);
			// sorts right side of the array
			doMergeSort(middle + 1, higherIndex);
			// now, merges both sides
			mergeParts(lowerIndex, middle higherIndex);
		}
	}

	// sorts the final array using the function doMergeSort() which uses the mergeParts() for the logic of the merging 
	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}
}
