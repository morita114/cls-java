interface Greeter {
            String  getName();  // 通常の抽象メソッド
    default void    greet() {   // Default メソッド
        System.out.println("こんにちは、" + getName() + "さん");
    }
}

class JapaneseUser implements Greeter {
    private String name;
    JapaneseUser(String name) { this.name = name; }

    @Override public String getName() { return name; }
    // greet() はそのまま継承
}

class EnglishUser implements Greeter {
    private String name;
    EnglishUser(String name) { this.name = name; }

    @Override public String getName() { return name; }

    @Override public void greet() { // greetもオーバーライド
        System.out.println("Hello, " + getName());
    }
}

public class DefaultGreeter {
    public static void main(String[] args) {
        Greeter g1 = new JapaneseUser("太郎");
        Greeter g2 = new EnglishUser("John");

        g1.greet();  // こんにちは、太郎さん
        g2.greet();  // Hello, John
    }
}


