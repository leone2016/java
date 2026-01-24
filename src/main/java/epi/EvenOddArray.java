package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import epi.test_framework.TestFailure;
import epi.test_framework.TimedExecutor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EvenOddArray {

  /**
   * Your input is an array of integers, and you have to reorder its entries so that
   * even entries appear first.
   * This is easy if you use O(n) space, where n is the length of the array. Can you do it in O(1) space?
   * [2, 82, 32, 130, 24, 232, 51, 117, 95, 177, 49, 233, 155]
                                        ^^
   * @param A
   */
  public static void evenOdd(List<Integer> A) {
    // TODO - you fill in here.
    int nextFast=0, nextOdd =0;
    int n = A.size();
    while(nextFast <  n){
      if(A.get(nextFast) %2 == 0 &&  nextFast != nextOdd){
        // swap
        int temp = A.get(nextOdd);//
        A.set(nextOdd, A.get(nextFast));//
        A.set(nextFast, temp);//
        nextOdd++;
      }
      nextFast++;
    }
    System.out.println("FIN");
  }
  @EpiTest(testDataFile = "even_odd_array.tsv")
  public static void evenOddWrapper(TimedExecutor executor, List<Integer> A)
      throws Exception {
    List<Integer> before = new ArrayList<>(A);
    executor.run(() -> evenOdd(A));

    boolean inOdd = false;
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i) % 2 == 0) {
        if (inOdd) {
          throw new TestFailure("Even elements appear in odd part");
        }
      } else {
        inOdd = true;
      }
    }
    List<Integer> after = new ArrayList<>(A);
    Collections.sort(before);
    Collections.sort(after);
    if (!before.equals(after)) {
      throw new TestFailure("Elements mismatch");
    }
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "EvenOddArray.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
