package src.singleton;

public class SingleTon {
    public static void main(String[] args) {
        GirlFriend girlFriend1 = GirlFriend.getInstance();
        GirlFriend girlFriend2 = GirlFriend.getInstance();

        System.out.println(girlFriend1 == girlFriend2);
    }

}

class GirlFriend {

    private String name;

    private static GirlFriend girlFriend = new GirlFriend("小红");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return girlFriend;
    }

    public String getName() {
        return name;
    }
}
