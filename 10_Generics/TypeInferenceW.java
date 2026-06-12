class Pair<K, V> {
    public K key;
    public V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class TypeInferenceW {
    public static void main(String[] args) {
        Pair<String, ?> p = new Pair<>("hello", 42);
        System.out.println("Pair contains: " + p.key + ", " + p.value);
        p.value = 23; // ワイルドカード型「?」へは代入できない
    }
}

