class Pair<K, V> {
    public K key;
    public V value;

    public Pair(K key, V value) { this.key = key; this.value = value; }

    @Override
    public String toString() { return key + " -> " + value; }
}

public class GenericBoxM {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("age", 20);
        System.out.println(pair); // age -> 20
        System.out.println("Key: " + pair.key);     // Key: age
        System.out.println("Value: " + pair.value); // Value: 20
    }
}

