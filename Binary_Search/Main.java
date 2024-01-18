import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    BinarySearch binarySearch = new BinarySearch();
    int arr[] = { 2, 2, 3, 3, 3, 3, 3, 4, 4, 10, 10, 40, 40 };
    int k = 10;
    // int res1 = binarySearch.binarySearch(arr, k);
    int res2 = binarySearch.binarySearchMore1(arr, k);
    int res3 = binarySearch.binarySearchMore2(arr, k);
    int ans[] = new int[2];
    ans[0] = res3;
    ans[1] = res2;
    System.out.println(Arrays.toString(ans));
    // System.out.println(res2);
    // System.out.println(res3);
  }
}