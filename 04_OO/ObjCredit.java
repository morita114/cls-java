class Student {
    private String name;
    private int credits;  // private で保護

    public Student(String name) {
        this.name = name;
        this.credits = 0;
    }

    // 単位加算：バリデーション付き
    public void addCredits(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("不正な単位数：<0");
        }
        if (credits + amount > 200) {  // 上限チェック
            throw new IllegalArgumentException("取得上限を超えています");
        }
        credits += amount;
    }

    public int getCredits() {
        return credits;
    }
}

public class ObjCredit {
    public static void main(String[] args) {
        Student alice = new Student("Alice");

        alice.addCredits(30);  // OK
        System.out.println(alice.getCredits());  // 30

        // alice.credits = -5;  // 直接アクセス不可
    }
}

