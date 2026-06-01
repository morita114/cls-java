import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        // 正しい値が入力されるまで繰り返す
        do {
            System.out.print("年齢を入力してください（0〜150）: ");
            age = sc.nextInt();

            if (age < 0 || age > 150) {           // || の短絡評価
                System.out.println("無効な値です。再入力してください。");
            }
        } while (age < 0 || age > 150);

        // 年齢による区分（if / else if / else）
        String category;
        if (age < 13) {
            category = "子ども";
        } else if (age < 18) {
            category = "中高生";
        } else if (age < 65) {
            category = "成人";
        } else {
            category = "シニア";
        }

        System.out.println("入力された年齢: " + age + "歳（" + category + "）");
        sc.close();
    }
}