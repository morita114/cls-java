class AppConfig {
    private static AppConfig instance = null; // 唯一のインスタンスをクラス自身が保持

    private AppConfig() {} // privateにすることで外部からのnewを禁止する

    static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig(); // 初回だけ生成
        }
        return instance;
    }

    String language = "ja"; // 保持したい設定値の例
}

class Singleton {
    public static void main(String[] args) {
        AppConfig c1 = AppConfig.getInstance();
        AppConfig c2 = AppConfig.getInstance();

        System.out.println(c1 == c2);      // true：同一インスタンス
        System.out.println(c1.language);   // ja
    }
}

