public class VarArgsArray {
    static void printNumbers1(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    static void printNumbers2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers1(1, 2, 3);            // 可変長引数
        printNumbers2(new int[]{1, 2, 3}); // 配列版

        printNumbers1();            // 引数なし
        printNumbers2(new int[]{}); // 空配列
    }
}

