import java.util.StringTokenizer;

public class StringSplit {
    public static void main(String[] args) {
        String data = "apple,banana,cherry";

        // StringTokenizerを使って文字列を分割
        StringTokenizer st = new StringTokenizer(data, ",");
        while (st.hasMoreTokens()) { System.out.println(st.nextToken()); }

        // Stringクラスのsplitメソッドを使って文字列を分割
        String[] fruits = data.split(",");
        for (String fruit : fruits) { System.out.println(fruit); }
    }
}

