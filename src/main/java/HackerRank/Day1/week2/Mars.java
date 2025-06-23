package HackerRank.Day1.week2;

public class Mars {
    public static int marsExploration(String s) {
        // Write your code here
        String pattern = "SOS";
        int changes = 0;

        for (int i = 0; i < s.length(); i++) {
            int test =i % 3;
            if (s.charAt(i) != pattern.charAt(test)) {
                changes++;
            }
        }

        return changes;
    }

    public static void main(String[] args) {
        int test = marsExploration("SOSOSOSOSDSDSKWOSDOSDOASDOASDFAFJDFDOSOSOWNSOSOSNDSKDDOSOSOSJDSDSOOSOSDSDOSASSOASDSAOSOSODSDSOASDWS");
        System.out.print(test);
    }
}
