import java.util.Arrays;
import java.util.Random;

public class Main {

  public static void bubbleSort(int A[]) {
    /**
     * How to sort the Array using the bubble sort.[5,4,3,2,1]
     * Firstly find the number of Iteration::N-1
     * Secondaly find the number of Swaps for each ::n-1-i+1
     */
    int n = A.length;
    for (int i = 1; i <= n - 1; i++) {
      // Above line shows the number of iteration.
      for (int j = 1; j <= n - 1 - i + 1; j++) {
        // This line of code shows that how many swapped
        if (A[j - 1] > A[j]) {
          // this line check wheater A[prev]>A[nxt] if true then swap happens
          int temp = A[j - 1];
          A[j - 1] = A[j];
          A[j] = temp;
        } else
          break;
      }
    }
  }

  public static void selectionSort(int A[]) {
    /**
     * Selection sort
     */
    int n = A.length;
    for (int i = 0; i < n - 2; i++) {
      int minIdx = i;
      for (int j = i + 1; j < n; j++) {
        if (A[j] < A[minIdx])
          minIdx = j;
      }
      int temp = A[i];
      A[i] = A[minIdx];
      A[minIdx] = temp;
    }
  }

  public static void insetionSort(int A[]) {

    /**
     * Insetion Sort
     * Divide the array into two parts ::sorted and unsorted
     * 
     * @param args
     */
    int n = A.length;
    for (int i = 1; i < n; i++) {
      int key = A[i];
      int j = i - 1;
      while (j >= 0 && A[j] > key) {
        A[j + 1] = A[j];
        j = j - 1;
      }
      A[j + 1] = key;
    }

  }

  public static void main(String[] args) {
     int[] arr = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            arr[i] = rand.nextInt(10000) + 1;
        }
 
        long startTime = System.nanoTime();
        bubbleSort(arr.clone());
        long bubbleSortTime = System.nanoTime() - startTime;
 
        startTime = System.nanoTime();
        selectionSort(arr.clone());
        long selectionSortTime = System.nanoTime() - startTime;
 
        startTime = System.nanoTime();
        insetionSort(arr.clone());
        long insertionSortTime = System.nanoTime() - startTime;
 
        System.out.println("Bubble Sort time:    " + bubbleSortTime);
        System.out.println("Selection Sort time: " + selectionSortTime);
        System.out.println("Insertion Sort time: " + insertionSortTime);
  }
}
