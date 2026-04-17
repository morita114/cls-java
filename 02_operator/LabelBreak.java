public class LabelBreak {
    public static void main(String[] args) {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    flag = true;        // フラグを立てて
                    break;              // 内側のループを抜ける
                }
                System.out.println("#1: " + i + "," + j);
            }
            if (flag) break;  // 外側のループを抜ける
        }        

        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer;  // 外側のループごと抜ける
                }
                System.out.println("#2: " + i + "," + j);
            }
        }
    }
}

