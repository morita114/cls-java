public class PassByRef {
    static void replaceRef(int[] arr) {
        // 引数変数が別オブジェクトを指すようにする
        arr = new int[]{9, 9, 9};
    }

    static void replaceValue(int[] arr) {
        // 引数変数が指すオブジェクトの内容を書き換える
        arr[0] = 5;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3};

        replaceRef(data);            // 「data」を参照渡し
        System.out.println(data[0]); // 1 ← 元のまま

        replaceValue(data);          // 「data」を参照渡し
        System.out.println(data[0]); // 5 ← 値が変更される
    }
}

