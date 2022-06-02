package homework.homework4;

public class Homework4 {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", 1000, 10);
        Worker worker = new Worker("李四", 1000, 10);

        Staff[] staffs = new Staff[2];
        staffs[0] = manager;
        staffs[1] = worker;

        for (Staff staff : staffs) {
            staff.printSalary();
        }
    }

}
