package homework.homework3;

public class SubProfessor extends Teacher{

    double bonus = 1.2;

    public SubProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.salary *= bonus;
    }

    @Override
    public void introduce() {
        System.out.println("This is a SubProfessor, my name is " + name + ", I am " + age + " years old, I am a " + post + " and I get " + salary + " per month.");
    }

    public String toString() {
        return "SubProfessor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
