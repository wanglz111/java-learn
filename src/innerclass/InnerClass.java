package src.innerclass;

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        new OuterClass.InnerClass().print();
    }
}

class OuterClass {
    private String name;

    static class InnerClass {
        public void print() {
            System.out.println("InnerClass");
        }
    }

    public void print() {
        System.out.println("OuterClass");
    }
}
