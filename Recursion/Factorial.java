/**
 * Factorial
 * When ever you want to solve the recusion problem firstly set the FAITH
 * CONDITION then solve.Using the Recursion Tree.
 */
public class Factorial {

  int factorial(int N) {
    if (N == 1)
      return 1;
    return factorial(N - 1) * N;
    // int ans = factorial(N - 1);
    // int res = ans * N;
    // return res;
  }
}