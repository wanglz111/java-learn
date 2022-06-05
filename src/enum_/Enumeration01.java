package src.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.autumn);
    }
}

class Season {
    private final String name;
    private final String desc;

    public static Season spring = new Season("spring", "warm");
    public static Season summer = new Season("summer", "hot");
    public static Season autumn = new Season("autumn", "cool");
    public static Season winter = new Season("winter", "cold");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
