package src.visitStatic;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu = new Stu("tom");
        stu.payFee(123.5);

        Stu jerry = new Stu("jerry");
        jerry.payFee(200.0);

        Stu.showFee();

    }

}

class Stu {
    public String name;

    private static double fee = 0;

    public Stu (String name) {
        this.name = name;
    }

    public void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费有: " + Stu.fee);
    }

    public static double getFee() {
        return fee;
    }
}