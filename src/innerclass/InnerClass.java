package src.innerclass;

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.print();
    }
}

class OuterClass {X
    private String name;

    class InnerClass {
        public void print() {
            System.out.println("InnerClass");
        }
    }

    public void print() {
        System.out.println("OuterClass");
    }
}
