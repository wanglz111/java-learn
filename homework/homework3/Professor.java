package homework.homework3;

public class Professor extends Teacher {

    double bonus = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.salary *= bonus;
    }

    @Override
    public void introduce() {
        System.out.println("This is a Professor, my name is " + name + ", I am " + age + " years old, I am a " + post + " and I get " + salary + " per month.");
    }

    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}