package leetCode.BinarySearch;

public class FirstCommit {

    public static int findFirstFailCommit(String[] unitTest) {
        return findFirstFailCommitRecursive(unitTest, 0, unitTest.length-1);
    }

    private static int findFirstFailCommitRecursive(String[] unitTest, int lower, int upper) {
        if (lower > upper)return -1;
        int mid = lower + (upper - lower) / 2;

        if( unitTest[mid].equals("fail") && (mid == 0 || unitTest[mid-1].equals("pass")))return mid;
        if(unitTest[mid].equals("pass"))
            return findFirstFailCommitRecursive(unitTest, mid+1, upper);
        else
            return findFirstFailCommitRecursive(unitTest, lower, mid-1);

    }

    public static void main(String[] args) {
        String[] unitTest = new String[]{"pass","pass","pass","pass","fail","fail", "fail"};
        int index = findFirstFailCommit(unitTest);
        System.out.println(index);
    }
}
