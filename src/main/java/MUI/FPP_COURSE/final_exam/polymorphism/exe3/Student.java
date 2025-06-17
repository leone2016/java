package MUI.FPP_COURSE.final_exam.polymorphism.exe3;

abstract public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract double computeGpa();

}
