enum Season {
    SPRING(3, 5, "春"),  SUMMER(6, 8, "夏"),
    AUTUMN(9, 11, "秋"), WINTER(12, 2, "冬");

    public  final int start;
    public  final int end;
    private final String name;
    Season(int start, int end, String name) {
        this.start = start; this.end = end; this.name = name;
    }

    public String getName() { return this.name; }
}

public class EnumField {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s);      // SUMMER
        System.out.println(s.start + "-" + s.end); // 6-8
        System.out.println(s.getName()); // 夏
        System.out.println(Season.WINTER.getName()); // 冬
    }
}

