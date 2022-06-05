package src.innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outerClass = new Outer02();
        outerClass.m1();

    }
}

class Outer02 {
    private int n1 = 100;

    private void m2() {
        System.out.println("m2");

    }

    public void m1() {
        class Inner02 {
            private int n1 =800;
            public void f1() {
                System.out.println(Outer02.this.n1);
                m2();
            }
        }

        Inner02 inner = new Inner02();
        inner.f1();
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
}
