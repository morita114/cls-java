import java.util.Scanner;  // Scannerのインポート

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("名前を入力: ");
        String name = sc.next();

        System.out.print("年齢を入力: ");
        int age = sc.nextInt(); // String以外は型に応じたメソッドを使う

        System.out.println(name + " は " + age + " 歳");
        sc.close();             // 使い終わったら閉じる
    }
}

