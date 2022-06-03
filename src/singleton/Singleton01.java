package src.singleton;

public class Singleton01 {
    public static void main(String[] args) {
        System.out.println(Cat.count);
        System.out.println(Cat.getInstance("name"));
        System.out.println(Cat.getInstance("name2"));
    }
}

class Cat {

    private String name;

    public static int count = 100;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static Cat cat;

    private Cat(String name){
        System.out.println("创建一只猫");
        this.name = name;
    }

    public static Cat getInstance(String name){
        if(cat == null){
            cat = new Cat(name);
        }
        return cat;
    }
}