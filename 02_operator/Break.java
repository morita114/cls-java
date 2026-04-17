public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;          // ループを抜ける
            if (i % 2 == 0) continue;   // 偶数はスキップ
            System.out.println(i);      // 1, 3だけ出力される
        }
    }
}

