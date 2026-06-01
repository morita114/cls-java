public class SwitchExpression {
    public static void main(String[] args) {
        int day = 1;
        String dayOfWeek = switch (day) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            default -> "Other";
        };  
        System.out.println("dayOfWeek is " + dayOfWeek);
    }
}

