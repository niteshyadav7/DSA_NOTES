public class PrintingIncDec {

  void printIncreasing(int N) {
    /**
     * Let say you have to print from 1 to 5 :1,2,3,4,5 using recusion
     * So the expectation is print ::1,2,3,4,5
     * assume the faith it's know to print 1,2,3,4 i.e n-1
     * meet the faith to expectation :: fun(n-1);print (n).
     * 
     * @param N
     */
    if (N == 0)// this is the line for ::BASE Case::
      return;
    printIncreasing(N - 1);// this line print the expectaion.
    System.out.print(N + " ");// By this line we meet the expectaion
  }

  void printDecreasing(int N) {
    /**
     * Expectaion ::5,4,3,2,1 Faith::4,3,2,1
     * i.e faith is fun(n-1)
     * meet the faith with expectaion :: print(n),fun(n-1)
     * Base Case N==0 return
     */
    if (N == 0)
      return;
    System.out.print(N + " ");
    printDecreasing(N - 1);
  }

  void printIncDec(int N) {
    /**
     * Expectaion::5,4,3,2,1,1,2,3,4,5
     * i.e faith :: 4,3,2,1,1,2,3,4
     * meet the faith to expectaion ::
     */
    if (N == 0)
      return;
    System.out.print(N + " ");
    printIncDec(N - 1);
    System.out.print(N + " ");
  }
}
