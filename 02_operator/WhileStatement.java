public class WhileStatement {
    public static void main(String[] args) {
        // while
        int i = 0;
        while (i < 5) {
            System.out.println("#1: " + i);
            i++;
        }

        // do-while（最低1回は実行）
        i = 0;
        do {
            System.out.println("#2: " + i);
            i++;
        } while (i < 5);
    }
}

