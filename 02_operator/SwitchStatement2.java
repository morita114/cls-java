public class SwitchStatement2 {
    public static void main(String[] args) {
        String day = "monday";

        switch (day) {
            case "monday":  System.out.println("月曜日"); break;
            case "tuesday": System.out.println("火曜日"); break;
            default:        System.out.println("その他");
        }
    }
}

