public class PassByValue {
    static void addTen(int x) {
        x = x + 10;          // ローカルコピーを書き換えるだけ
        System.out.println("メソッド内: " + x); // 20
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println("呼び出し前: " + num); // 10
        addTen(num);
        System.out.println("呼び出し後: " + num); // 10
    }
}

