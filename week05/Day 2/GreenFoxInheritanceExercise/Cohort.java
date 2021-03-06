package GreenFoxInheritanceExercise;

import java.util.ArrayList;

public class Cohort {

    String name;
    ArrayList<Student> students= new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

    Cohort(String name) {
        this.name = name;
    }

    Cohort() {
        this.name = "";
    }
}
