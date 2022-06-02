package homework.homework4;

public class Staff {
    public String name;
    public double salaryPerDay;
    public int workDays;
    public double grade;

    public Staff(String name, double salaryPerDay, int workDays) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.workDays = workDays;
        this.grade = 1;
    }

    public void printSalary() {
        System.out.println("员工姓名：" + name + "，工资：" + (salaryPerDay * workDays * grade));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerDay() {
        return this.salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getWorkDays() {
        return this.workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }



}
