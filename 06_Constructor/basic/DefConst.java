class Person {
    String name;
    int age;

    // Person() {}
    // をコンパイラが自動生成
}

public class DefConst {
    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println("Name: " + obj.name); // null
        System.out.println("Age: " + obj.age);   // 0
    }
}

