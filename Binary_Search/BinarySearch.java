/**
 * BinarySearch
 */
public class BinarySearch {

  int binarySearch(int A[], int k) {
    int n = A.length;
    int start = 0;
    int end = n - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (A[mid] == k)
        return mid;
      if (A[mid] < k)
        start = mid + 1;
      else if (A[mid] > k)
        end = mid - 1;
    }
    return -1;
  }

  int binarySearchMore1(int A[], int k) {
    int n = A.length;
    int start = 0;
    int end = n - 1;
    int ans = -1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (A[mid] == k) {
        start = mid + 1;
        // arr[1] = mid;
        ans = mid;
      }
      // return mid;
      if (A[mid] < k)
        start = mid + 1;
      else if (A[mid] > k)
        end = mid - 1;
    }
    return ans;
  }

  int binarySearchMore2(int A[], int k) {
    int n = A.length;
    int start = 0;
    int end = n - 1;
    int ans = -1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (A[mid] == k) {
        end = mid - 1;
        // arr[1] = mid;
        ans = mid;
      }
      // return mid;
      if (A[mid] < k)
        start = mid + 1;
      else if (A[mid] > k)
        end = mid - 1;
    }
    return ans;
  }

}