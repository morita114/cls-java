class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class ThreadCls {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        t1.start();  // run()ではなくstart()を呼ぶ
        System.out.println("main thread continues...");
    }
}

