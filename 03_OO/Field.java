class Counter {
    int count;              // インスタンスフィールド（各インスタンスが個別に持つ）
    static int total = 0;   // クラスフィールド（全インスタンスで共有）
}

public class Field {
    public static void main(String[] args) {
        Counter c1 = new Counter(), c2 = new Counter();

        c1.count++; c1.total++;
        c1.count++; c1.total++;
        c2.count++; c2.total++;

        System.out.println(c1.count);      // 2（c1 固有）
        System.out.println(c2.count);      // 1（c2 固有）
        System.out.println(c1.total);      // 3（全体で共有）
        System.out.println(c2.total);      // 3（全体で共有）
        System.out.println(Counter.total); // 3（全体で共有）
    }
}

