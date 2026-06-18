enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class DayOfWeek {
    public static void main(String[] args) {
        Day d = Day.MONDAY;
        System.out.println(d);              // MONDAY
        // d = 999;                         // エラー
        // d = Day.TUESDAY + Day.WEDNESDAY; // エラー
    }
}

