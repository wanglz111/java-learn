package src.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        Season2[] values = Season2.values();
        for (Season2 s : values) {
            System.out.println(s);
        }
    }
}

enum Season2 {
    SPRING("spring", "warm"),
    SUMMER("summer", "hot"),
    AUTUMN("autumn", "cool"),
    WINTER("winter", "cold");

    private final String name;
    private final String desc;

//    public static Season spring = new Season("spring", "warm");
//    public static Season summer = new Season("summer", "hot");
//    public static Season autumn = new Season("autumn", "cool");
//    public static Season winter = new Season("winter", "cold");

    Season2(String name, String desc) {
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
