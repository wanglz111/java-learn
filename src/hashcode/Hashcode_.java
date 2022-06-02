package src.hashcode;

/**
 * Hashcode_
 */
public class Hashcode_ {

    public static void main(String[] args) {
        AA aa = new AA("123");
        System.out.println(aa);
        aa = null;
        System.gc();

        System.out.println("123");

    }

}

/**
 * InnerHashcode_
 */
class AA {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AA(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("释放该资源");
    }
}