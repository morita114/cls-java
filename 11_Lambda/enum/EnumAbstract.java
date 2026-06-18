enum Season {
    SPRING(3, 5) { public String getName() { return "春"; } },
    SUMMER(6, 8) { public String getName() { return "夏"; } },
    AUTUMN(9, 11) { public String getName() { return "秋"; } },
    WINTER(12, 2) { public String getName() { return "冬"; } };

    public final int start;
    public final int end;
    Season(int start, int end) {
        this.start = start; this.end = end;
    }

    public abstract String getName();
}

public class EnumAbstract {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s);                       // SUMMER
        System.out.println(s.start + "-" + s.end);   // 6-8
        System.out.println(s.getName());             // 夏
        System.out.println(Season.WINTER.getName()); // 冬
    }
}

