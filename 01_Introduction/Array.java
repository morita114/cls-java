public class Array {
    public static void main(String[] args) {
        // 配列の宣言と初期化
        int[] arr1 = new int[5];        // 長さ5のint型配列を宣言
        int[] arr2 = {1, 2, 3, 4, 5};   // 宣言と同時に初期化

        // 配列の要素へのアクセス
        System.out.println(arr1[0]);    // 0（初期値）
        System.out.println(arr2[0]);    // 1

        // 配列の長さ
        System.out.println(arr1.length);    // 5
        System.out.println(arr2.length);    // 5

        // 配列の要素の変更
        arr1[0] = 10;    System.out.println(arr1[0]);    // 10
        arr2[0] = 20;    System.out.println(arr2[0]);    // 20
    }
}
