class CountUpTask implements Runnable {
    private final String taskName;
    private final int maxCount;

    public CountUpTask(String taskName, int maxCount) {
        this.taskName = taskName;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxCount; i++) {
            System.out.println("[" + taskName + "] " + i);
        }
    }
}

public class Ex1Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new CountUpTask("TaskA", 3));
        Thread t2 = new Thread(new CountUpTask("TaskB", 3));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("全スレッド終了");
    }
}
