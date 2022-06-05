package src.innerclass;

interface IA {
    void cry();

    void eat();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.print();
    }
}

class Outer03 {
    public void print() {
        IA tiger = new IA() {
            public void cry() {
                System.out.println("Tiger cry");
            }

            public void eat() {
                System.out.println("Tiger eat");
            }
        };
        tiger.cry();
        System.out.println(tiger.getClass());
        tiger.eat();
        System.out.println(tiger.getClass());
    }
}
