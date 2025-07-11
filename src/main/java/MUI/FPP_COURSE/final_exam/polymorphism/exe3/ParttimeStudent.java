package MUI.FPP_COURSE.final_exam.polymorphism.exe3;
import java.util.*;
public class ParttimeStudent extends Student {
	/*private String name;*/
	private ParttimeTranscriptRecord record;
	public ParttimeStudent(String name, ParttimeTranscriptRecord record) {
		super(name);
		this.record = record;
	}

	@Override
	public double computeGpa() {
		List<Double> grades = record.getRecord();
		if(grades.isEmpty()) return 0.0;
		double sum = 0.0;
		for(Double d : grades) {
			sum += d.doubleValue();
		}
		return sum / grades.size();
	}
	/*public String getName() {
		return name;
	}*/
	/*public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof ParttimeStudent)) return false;
		ParttimeStudent pts = (ParttimeStudent)ob;
		return name.equals(pts.name);
	}*/
	/*public String toString() {
		return this.name;
	}*/
}
