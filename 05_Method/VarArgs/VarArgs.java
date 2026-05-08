public class VarArgs {
    // 定義：型の後に ... を付ける
    static int sum(int... nums) {
        int total = 0;
        for (int n : nums) {   // nums は int[] として扱える
            total += n;
        }
        return total / nums.length;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));          // 3
        System.out.println(sum(1, 2, 3, 4, 5)); // 15
        // System.out.println(sum());              // 0（0個も可）
    }
}

