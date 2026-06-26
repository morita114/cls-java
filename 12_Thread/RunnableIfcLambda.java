public class RunnableIfcLambda {
    public static void main(String[] args) throws Exception {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + i);
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    return;
                }
            }
        };
        Thread thread = new Thread(task);

        System.out.println("main: 1");
        thread.start();                 // スレッドの処理を開始
        System.out.println("main: 2");
        Thread.sleep(150L);             // mainのスレッドを150ms停止
        System.out.println("main: 3");
        thread.join();                  // スレッドの終了を待機
        System.out.println("main: 4");
    }
}

