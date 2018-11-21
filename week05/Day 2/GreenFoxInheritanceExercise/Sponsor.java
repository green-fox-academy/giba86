package GreenFoxInheritanceExercise;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    void hire(int hiredStudents) {
        this.hiredStudents ++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    Sponsor() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }
}
