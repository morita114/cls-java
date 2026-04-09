public class Variable {
    public static void main(String[] args) {
        // 変数の初期化
        int x = 0;    System.out.println(x);    // 宣言と同時に初期化
        int y; y = 0; System.out.println(y);    // 宣言→初期化でもOK
        int z;        System.out.println(z);    // エラー: 初期化されていない変数を使用
                                                // Cでは未初期化の変数は不定値を持つことがある
        
        // 真偽値
        boolean b = true;    System.out.println(b);
        boolean c = 1;       System.out.println(c);    // エラー: int型をboolean型に代入できない

        // 文字列型
        String s = "hello, world";    // 文字列は配列ではない
        System.out.println(s);
    }
}

