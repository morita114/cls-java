public class ThreadLife {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Start worker: " + Thread.currentThread().getState());
            // → RUNNABLE

            // 仮想的な重たい処理 → TIMED_WAITING
            try {
                Thread.sleep(2_000); // 2秒間スリープ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 実際の重たい処理を実行 → RUNNABLE
            long sum = 0;
            for (long i = 0; i < 5_000_000_000L; i++) { sum += i; }
            
            System.out.println("End worker: " + Thread.currentThread().getState());
            // → RUNNABLE
        });

        System.out.println("Before start(): " + worker.getState()); // NEW
        worker.start();
        System.out.println("After start(): " + worker.getState());  // RUNNABLE
        
        Thread.sleep(500); // 少し(<2,000)待ってから状態を確認
        System.out.println("After sleep(): " + worker.getState());  // TIMED_WAITING / RUNNABLE

        worker.join();  // workerが終わるまでmainスレッドは待機
        System.out.println("After join(): " + worker.getState());   // TERMINATED
    }
}

