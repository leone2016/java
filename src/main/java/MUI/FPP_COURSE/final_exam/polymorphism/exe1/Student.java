package MUI.FPP_COURSE.final_exam.polymorphism.exe1;

public class Student {
	private String name;
	private String studentId;
	private CheckoutRecord record;
	public Student(String name, String studentId, CheckoutRecord record) {
		this.name = name;
		this.studentId = studentId;
		this.record = record;
	}
	
	public String getName() {
		return name;
	}

	public String getStudentId() {
		return studentId;
	}

	public CheckoutRecord getRecord() {
		return record;
	}
	public String toString() {
		return "{Name: " + name + "Overdue: " + record.getOverdueBooks() + "}";
	}
}
