class Dog {
    private final String name;
    Dog(String name) { this.name = name; }

    @Override   // Object クラスの toString() をオーバーライド
    public String toString() { return "Dog{name='" + name + "'}"; }

    @Override   // Object クラスの equals() をオーバーライド
    public boolean equals(Object obj) {
        if (this == obj) return true;  // 同一オブジェクトなら true
    }
}

public class ObjectCls {
    public static void main(String[] args) {
        Dog d1 = new Dog("ポチ");
        Dog d2 = new Dog("ポチ2");
        System.out.println(d1);  // Dog{name='ポチ'}
        System.out.println(d1.equals(d2)); // false（内容は同じだが別のオブジェクト）
    }
}

