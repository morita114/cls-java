import java.util.ArrayList;

class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst()  { return first; }
    public V getSecond() { return second; }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class Ex1Class {
    public static void main(String[] args) {
        ArrayList<Pair<String, Integer>> students = new ArrayList<>();
        students.add(new Pair<>("Alice", 85));
        students.add(new Pair<>("Bob",   72));
        students.add(new Pair<>("Carol", 91));

        int total = 0;
        for (Pair<String, Integer> p : students) {
            System.out.println(p.getFirst() + ": " + p.getSecond());
            total += p.getSecond();
        }

        System.out.println("平均点: " + (double) total / students.size());
    }
}