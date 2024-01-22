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
     * 
     * MOST-IMPORTANT FORMULA:sum(e,s)=pf[e]-pf[s-1]******************
     * 
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

  int specialIndex(int A[]) {
    /**
     * [4 ,3 ,2 ,7 ,6 ,7,2] Search Wheater special Index exist or not. i.e After
     * removing the i-th index sum of Even and Odd Index are equal than return true
     * .
     * Algorithm : we observe that after removing the i-th idx ::Before :: Odd and
     * even are as it is. But after removing i-th odd index became the even and even
     * became the odd.
     * 
     * Steps:Firsty create the odd and even prefix sum .
     * pfe=[4,4,6,6,12,12,14] And pfo=[0,3,3,10,10,17,17] Suppose we remove A[]
     * index 3.
     * pfe(i-1)to pfe(0) ==>pf[e]-pfe(s) where s=0 and e=i-1.
     * 
     * sum of even =(pfe[i-1]-0)+(pfo[n]-pfo[i+1-1])
     * sum of odd =(pfo[i-1]-0)+(pfe[n]-pfe[i+1-1])
     */
    int temp = 0;
    int n = A.length;
    int prefixSumEven[] = new int[n];
    int prefixSumOdd[] = new int[n];

    // Now creating the prefix sum of even .
    prefixSumEven[0] = A[0];
    for (int i = 1; i < n; i++) {
      if (i % 2 == 0) {
        prefixSumEven[i] = prefixSumEven[i - 1] + A[i];
      } else {
        prefixSumEven[i] = prefixSumEven[i - 1];
      }
    }
    // Now creating the prefix sum of odd.
    prefixSumOdd[0] = 0;
    for (int i = 1; i < n; i++) {
      if (i % 2 != 0) {
        prefixSumOdd[i] = prefixSumOdd[i - 1] + A[i];
      } else {
        prefixSumOdd[i] = prefixSumOdd[i - 1];
      }
    }
    // Now checking the value.
    for (int i = 0; i < n; i++) {
      int evenSum = 0;
      int oddSum = 0;
      if (i == 0) {
        evenSum = prefixSumOdd[n - 1] - prefixSumOdd[i + 1 - 1];
        oddSum = prefixSumEven[n - 1] - prefixSumEven[i + 1 - 1];
      } else if (i == n - 1) {
        oddSum = prefixSumOdd[n - 1] - prefixSumOdd[i + 1 - 1];
        evenSum = prefixSumEven[n - 1] - prefixSumEven[i + 1 - 1];
      } else {
        evenSum = prefixSumEven[i - 1] + prefixSumOdd[n - 1] - prefixSumOdd[i + 1 - 1];
        oddSum = prefixSumOdd[i - 1] + prefixSumEven[n - 1] - prefixSumEven[i + 1 - 1];
      }
      if (evenSum == oddSum)
        temp++;
    }

    printArray(prefixSumEven);
    printArray(prefixSumOdd);
    return temp;
  }
}
