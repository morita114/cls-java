public class NormArg {
    // 可変長引数は必ず最後に置く
    static void printAll(String label, int... values) {
        System.out.print(label + ": ");
        for (int v : values) { System.out.print(v + " "); }
        System.out.println();
    }

    public static void main(String[] args) {
        printAll("スコア", 80, 95, 72); // スコア: 80 95 72
        printAll("空配列");            // 空配列:
    }
}

