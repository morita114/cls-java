class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(100L); // 現在のスレッドを100ms停止
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadMain {
  public static void main(String[] args) throws Exception {
    HelloThread thread = new HelloThread();

    System.out.println("main: 1");
    thread.start();                 // スレッドの処理を開始
    System.out.println("main: 2");
    Thread.sleep(150L);             // mainのスレッドを150ms停止
    System.out.println("main: 3");
    thread.join();                  // スレッドの終了を待機
    System.out.println("main: 4");
  }
}

