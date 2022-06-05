package src.homework.homework4;

public class Worker extends Staff {

    private double grade;

    public Worker(String name, double salaryPerDay, int workDays) {
        super(name, salaryPerDay, workDays);
        this.grade = 1.1;
    }

    @Override
    public void printSalary() {
        System.out.println("工人姓名：" + getName() + "，工资：" + (getSalaryPerDay() * getWorkDays() * getGrade()));
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
