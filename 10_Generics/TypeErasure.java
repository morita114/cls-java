class Box<T> {
    public T value;
    public Box(T value) { this.value = value; }
}

public class TypeErasure {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(42);
        if (intBox instanceof Box) { System.out.println("intBox is Box"); }
        if (intBox instanceof Box<?>) { System.out.println("intBox is Box<?>"); }
        if (intBox instanceof Box<Integer>) { System.out.println("intBox is Box<Integer>"); }

        Object objBox = new Box<Integer>(32);
        if (objBox instanceof Box) { System.out.println("objBox is Box"); }
        if (objBox instanceof Box<?>) { System.out.println("objBox is Box<?>"); }
        // if (objBox instanceof Box<Integer>) { System.out.println("objBox is Box<Integer>"); } // Compile error
    }
}

