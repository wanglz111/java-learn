package src.visitStatic;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.getName());
    }
}

class A {
    private static String name = "A";

    public static String getName() {
        return name;
    }
}
