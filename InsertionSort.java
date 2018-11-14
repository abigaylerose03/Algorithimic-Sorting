public class InsertionSort {
  // Insertion sort is a simple sorting algorithm, 
  // it builds the final sorted array one item at a time.
  // It is much less efficient on large lists than other sort algorithms. 
  public static void main(String[] args) {
    int[] arr1 = {10, 125, 2, 53, 253, 123, 2};
    doInsertionSort(arr1);
    
    for(i : arr1) { 
      System.out.print(i)  
      System.out.print(",");
    }
  }
  
  public static int doInsertionSort(int[] input) {
    int temp;
    for(int i = 1; i < input.length; i++) {
      for(j = i; j > 0; j--) {
        if(input[j] < input[j - 1]) {
          temp = input[j]; // store the variable that goes through each element, j
          input[j] = input[j - 1];
          input[j - 1] = temp;
        }
      }
    }

  }

}
