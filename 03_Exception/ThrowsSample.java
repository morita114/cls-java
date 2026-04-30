public class ThrowsSample {
    public static void main(String[] args) {
        try {
            readFile("NotExisting.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("ファイルが見つかりませんでした。");
        }
    }

    public static void readFile(String filename) throws java.io.FileNotFoundException {
        java.io.FileReader file = new java.io.FileReader(filename);
        // ファイルを読み込む処理
    }
}

