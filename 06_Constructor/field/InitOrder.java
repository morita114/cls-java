class Counter {
    int count = 1;

    Counter() { }
    Counter(int count) {
        this.count = count;
    }
}

public class InitOrder {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter(5);
        System.out.println("Count: " + c1.count); // 1
        System.out.println("Count: " + c2.count); // 5
    }
}

