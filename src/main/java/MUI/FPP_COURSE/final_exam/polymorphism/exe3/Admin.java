package MUI.FPP_COURSE.final_exam.polymorphism.exe3;

import java.util.*;
public class Admin {
	public static List<Student> convertArray(Student[] studentArray) {
        return new ArrayList<>(Arrays.asList(studentArray));
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		double averageGpa = 0;
		for (Student student : studentList) {
			averageGpa+= student.computeGpa();
		}
		return averageGpa/studentList.size();
	}
}
