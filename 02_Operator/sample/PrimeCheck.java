import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int n = sc.nextInt();

        // 素数判定
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            // SQRT(n)までの整数で割り切れるか調べる（nが合成数なら必ず見つかる）
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;              // 見つかったら終了
                }
            }
        }

        // 三項演算子で出力
        System.out.println(n + " は " + (isPrime ? "素数です" : "素数ではありません"));

        sc.close();
    }
}

// $ java PrimeCheck 
// 整数を入力してください: 13
// 13 は 素数です
// 
// $ java PrimeCheck 
// 整数を入力してください: 18
// 18 は 素数ではありません