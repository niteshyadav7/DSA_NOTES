/**
 * Main
 * 
 */
public class Main {

  public static void main(String[] args) {
    Solution sn = new Solution();
    // int arr[] = sn.takeInput();
    // sn.printArray(arr);
    // // sn.reverseArray(arr, 0, arr.length - 1);
    // sn.rotateArray(arr, 2 * 3);
    // sn.printArray(arr);

    // int a[] = { 1, 2, 3, 4, 5 };
    // int b[][] = { { 0, 3 }, { 1, 2 } };
    // int res1[] = sn.prefixSumWithQuery(a, b);
    // sn.printArray(res1);
    // System.out.println(res1);
    int a[] = { 2, 1, 6, 4 };
    System.out.println(sn.specialIndex(a));
  }
}