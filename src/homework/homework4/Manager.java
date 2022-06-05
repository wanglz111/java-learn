package src.homework.homework4;

public class Manager extends Staff{

    public int bonus;

    private double grade;

    public Manager(String name, double salaryPerDay, int workDays) {
        super(name, salaryPerDay, workDays);
        this.bonus = 1000;
        this.grade = 1.3;
    }

    @Override
    public void printSalary() {
        System.out.println("经理姓名：" + getName() + "，工资：" + (getSalaryPerDay() * getWorkDays() * getGrade() + bonus));
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
