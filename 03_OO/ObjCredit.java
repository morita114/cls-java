class Student {
    private String name;
    private int studentID;
    private int credits;  // private で保護

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.credits = 0;
    }

    // 単位加算：バリデーション付き
    public void addCredits(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("単位数は0以上である必要があります");
        }
        if (credits + amount > 200) {  // 上限チェック
            throw new IllegalArgumentException("取得上限を超えています");
        }
        credits += amount;
    }

    // 単位減算：バリデーション付き
    public void subtractCredits(int amount) {
        if (amount < 0 || credits < amount) {
            throw new IllegalArgumentException("不正な操作です");
        }
        credits -= amount;
    }

    public int getCredits() {
        return credits;
    }
}