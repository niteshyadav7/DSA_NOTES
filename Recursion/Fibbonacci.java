public class Fibbonacci {

  int printFibb(int N) {
    if (N == 0 || N == 1)
      return N;
    int a = printFibb(N - 1);
    int b = printFibb(N - 2);
    return a + b;
  }
}
