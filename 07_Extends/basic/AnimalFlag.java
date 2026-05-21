class Animal {
    String type;  // "dog" または "cat" で切り替える
    Animal(String type) {
        if (!type.equals("dog") && !type.equals("cat")) {
            throw new IllegalArgumentException("Unexpected animal type: " + type);
        }
        this.type = type;
    }

    void speak() {
        if      (type.equals("dog")) { System.out.println("ワン"); }
        else if (type.equals("cat")) { System.out.println("ニャー"); }
    }
}

public class AnimalFlag {
    public static void main(String[] args) {
        Animal dog = new Animal("dog"); dog.speak();
        Animal cat = new Animal("cat"); cat.speak();
    }
}


