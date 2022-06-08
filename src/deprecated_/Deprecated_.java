package src.deprecated_;

public class Deprecated_ {
    public static void main(String[] args) {

    }
}

@Deprecated
class A {
    public int n1 =10;
    @Deprecated
    public void h1() {
        System.out.println("h1");
    }

    // 继承A的范型
    public <T> void h2(T t) {
        System.out.println("h2");
    }

}
