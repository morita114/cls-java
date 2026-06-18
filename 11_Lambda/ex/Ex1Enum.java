enum DayOfWeek {
    MONDAY("月曜日", false),
    TUESDAY("火曜日", false),
    WEDNESDAY("水曜日", false),
    THURSDAY("木曜日", false),
    FRIDAY("金曜日", false),
    SATURDAY("土曜日", true),
    SUNDAY("日曜日", true);

    private String japaneseName;
    private boolean isWeekend;

    DayOfWeek(String japaneseName, boolean isWeekend) {
        this.japaneseName = japaneseName;
        this.isWeekend = isWeekend;
    }

    public String getJapaneseName() {
        return japaneseName;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

public class Ex1Enum {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            String type = day.isWeekend() ? "休日" : "平日";
            System.out.println(day.getJapaneseName() + "：" + type);
        }
    }
}