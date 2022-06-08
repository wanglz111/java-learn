package src.homework.homework5;

public class Homework5 {
    public static void main(String[] args) {
        new CellPhone().testWork(
                new ICalculate() {
                    @Override
                    public double work(double a, double b) {
                        return a + b;
                    }
                }, 10, 20);
    }
}

interface ICalculate {
    public double work (double a, double b);
}

class CellPhone {
    public void testWork(ICalculate c, double a, double b) {
        System.out.println(c.work(a, b));
    }
}
