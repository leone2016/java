package udemy.U_lamdas.repo;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int height;
    private double salary;
    private String gender;
    private int kids;
    List<String> hobbies = new ArrayList<>();

    public Person(String name,int height, double salary,String gender, int kids, List<String> hobbies ) {
        super();
        this.hobbies = hobbies;
        this.kids = kids;
        this.gender = gender;
        this.salary = salary;
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
