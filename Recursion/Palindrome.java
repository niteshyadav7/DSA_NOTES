public class Palindrome {
  boolean checkPalindrome(String A, int i, int j) {
    // int i = 0;
    // int j = A.length() - 1;
    if (i >= j)
      return true;
    if (A.charAt(i) != A.charAt(j))
      return false;
    return checkPalindrome(A, i + 1, j - 1);
  }

  boolean solve(String A) {
    return checkPalindrome(A, 0, A.length() - 1);
  }
}
