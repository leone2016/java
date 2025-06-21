package HackerRank.Day1.week2;
import java.util.*;

public class GradingStudentsMIU {
        public static void main(String[] args) {
            List<Integer> grades = Arrays.asList(73, 67, 38, 33);
            List<Integer> rounded = gradingStudents(grades);

            for (int grade : rounded) {
                System.out.println(grade);
            }
        }
        public static List<Integer> gradingStudents(List<Integer> grades) {
            List<Integer> result = new ArrayList<>();

            for (int grade : grades) {
                if (grade < 38) {
                    result.add(grade); // no rounding
                } else {
                    int test = (grade / 5);
                    int nextMultiple = (test + 1) * 5;
                    if (nextMultiple - grade < 3) {
                        result.add(nextMultiple); // round up
                    } else {
                        result.add(grade); // no change
                    }
                }
            }

            return result;
        }
}
