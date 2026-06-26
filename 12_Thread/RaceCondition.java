class Counter {
    public int count = 0;

    public void increment() {
        count++;  // 「読み取り→加算→書き込み」の3ステップ
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) { counter.increment(); }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // 毎回異なる値になる（期待する値は200,000）
        System.out.println("Result: " + counter.count);
    }
}

