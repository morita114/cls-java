public class VarArgsA {
    static void print(int... nums) {
        System.out.println("Size: " + nums.length);
    }

    public static void main(String[] args) {
        print();                // Size: 0
        print(new int[]{});     // Size: 0
        print(1);               // Size: 1
        print(new int[]{1, 2}); // Size: 2
        print(1, 2, 3);         // Size: 3
    }
}

