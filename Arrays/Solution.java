import java.util.Scanner;

public class Solution {
  int[] takeInput() {
    /**
     * How to Take the Input :
     * Time Complexity is O(N) And Space Complexity is O(N).
     * Bze we create the array of size N .i.e Space complexity is O(N).
     */
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size : ");
    int size = sc.nextInt();// take the size
    int arr[] = new int[size];// initialize the arrays
    for (int i = 0; i < size; i++) {
      System.out.print("Enter the value : " + i + "th : ");
      arr[i] = sc.nextInt();
    }
    return arr;
  }

  void printArray(int A[]) {
    /**
     * This function is used for printing the arrays
     * Time complexity is O(N) And Space Complexity is O(1).
     */
    int n = A.length;
    System.out.print("[");
    for (int i = 0; i < n; i++) {
      if (i != n - 1)
        System.out.print(A[i] + ", ");
      else
        System.out.print(A[i]);
    }
    System.out.print("]");
    System.out.println();
  }

  void reverseArray(int A[], int start, int end) {
    /**
     * This function is used for reverse the array with given the start and
     * end value . With this you can reverse the array
     * The time complexity is O(N) And Space Complexity is O(1).
     */
    while (start < end) {
      int temp = A[start];
      A[start] = A[end];
      A[end] = temp;
      start++;
      end--;
    }
  }

  void rotateArray(int A[], int K) {
    int n = A.length;
    int k = K % n;
    reverseArray(A, 0, n - 1);
    reverseArray(A, 0, k - 1);
    reverseArray(A, k, n - 1);
  }

  int[] prefixSumWithQuery(int A[], int B[][]) {
    /**
     * Return the Array of query sum
     * Firstly create the prefix sum.
     * Then calculate the left and right values.
     * FORMULA:pf[right]-pf[left-1].
     */
    int n = A.length;
    int pf[] = new int[n];
    pf[0] = A[0];// By this we set the 0-th element.
    for (int i = 1; i < n; i++) {
      pf[i] = pf[i - 1] + A[i];// This is the logic for creating Prefix Array.
    }
    printArray(pf);
    int ans[] = new int[B.length];
    for (int i = 0; i < B.length; i++) {
      int left = B[i][0];
      int right = B[i][1];
      if (left > 0) {
        ans[i] = pf[right] - pf[left - 1];
      } else {
        ans[i] = pf[right];
      }
    }
    return ans;
  }
}
