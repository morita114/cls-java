interface Printable {
    String getContent();
    default String format() { return "[印刷用] " + getContent(); }
    default void print() { System.out.println(format()); }
}

interface Loggable {
    String getContent();
    default String format() { return "[ログ用] " + getContent(); }
    default void log() { System.out.println(format()); }
}

abstract class BaseDocument {
    String title;
    String body;
    BaseDocument(String title, String body) { this.title = title; this.body = body; }
    abstract String getContent();
}

class Report extends BaseDocument implements Printable, Loggable {
    Report(String title, String body) { super(title, body); }

    @Override
    public String format() {
        return "[レポート] " + getContent();
    }
    
    @Override
    public String getContent() {
        return title + ": " + body;
    }
}

public class Answer {
    public static void main(String[] args) {
        Report r = new Report("売上報告", "今月の売上は100万円です");

        r.print();
        r.log();

        // インタフェース型でも扱えることを確認
        Printable p = r;
        p.print();

        Loggable l = r;
        l.log();
    }
}

