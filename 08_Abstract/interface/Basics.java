interface Addable {
    int add(int x);
}

interface Printable {
    void print();
}

class Value implements Addable, Printable {
    int x;
    Value(int x) { this.x = x; }

    @Override public int add(int v) { return x += v; }
    @Override public void print() { System.out.println("Value: " + x); }
}

public class Basics {
    public static void main(String[] args) {
        Value v = new Value(10);
        v.print();  // Value: 10
        v.add(5);
        v.print();  // Value: 15
    }
}

