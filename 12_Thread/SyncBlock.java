class Counter {
    public int count = 0;
    private final Object lock = new Object();

    public void increment() {
        synchronized (lock) { count++; }
    }
}

public class SyncBlock {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) { counter.increment(); }
        };

        Thread t1 = new Thread(task), t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join();  t2.join();

        System.out.println("Result: " + counter.count); // 200,000
    }
}

