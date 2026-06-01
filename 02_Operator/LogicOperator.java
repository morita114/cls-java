public class LogicOperator {
    public static void main(String[] args) {
        boolean dummy;
        
        // 短絡評価
        dummy = true  && LogicOperator.println("true &&");    // → "true &&" と表示される
        dummy = true  || LogicOperator.println("true ||");    // → 短絡評価でスキップ
        dummy = false && LogicOperator.println("false &&");   // → 短絡評価でスキップ
        dummy = false || LogicOperator.println("false ||");   // → "false ||" と表示される

        // 非短絡評価（全て表示される）
        dummy = true  & LogicOperator.println("true &");
        dummy = true  | LogicOperator.println("true |");
        dummy = false & LogicOperator.println("false &");
        dummy = false | LogicOperator.println("false |");
    }

    public static boolean println(String message) {
        System.out.println(message);
        return true;
    }
}

