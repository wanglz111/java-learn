package src.homework.homework3;

public class Lecturer extends Teacher {

    double bonus = 1.1;

    public Lecturer (String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.salary *= bonus;
    }

    @Override
    public void introduce() {
        System.out.println("This is a Lecturer, my name is " + name + ", I am " + age + " years old, I am a " + post + " and I get " + salary + " per month.");
    }

    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
