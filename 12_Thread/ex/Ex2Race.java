class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized int getBalance() {
        return balance;
    }
}

public class Ex2Race {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(0);

        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                account.deposit(1);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("残高: " + account.getBalance());
    }
}

