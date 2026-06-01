public class GradeEval {
    public static void main(String[] args) {
        int[] scores = {85, 92, 47, 63, 78, 55, 99, 34, 71, 88};

        int sum = 0;
        int highest = scores[0];
        int lowest  = scores[0];

        // 拡張forで集計
        for (int score : scores) {
            sum += score;
            if (score > highest) highest = score;
            if (score < lowest)  lowest  = score;
        }

        double average = (double) sum / scores.length;

        System.out.println("平均点: " + average);
        System.out.println("最高点: " + highest);
        System.out.println("最低点: " + lowest);
        System.out.println();

        // switch で成績評価（各自の点数）
        for (int i = 0; i < scores.length; i++) {
            int grade = scores[i] / 10;     // 10の位で判定
            String eval = switch (grade) {  // switch式
                case 10, 9 -> "A（優）";
                case 8,7   -> "B（良）";
                case 6     -> "C（可）";
                default    -> "F（不合格）";
            };
            System.out.printf("%2d番: %3d点 → %s%n", i + 1, scores[i], eval);
        }
    }
}

// 平均点: 71.2
// 最高点: 99
// 最低点: 34

//  1番:  85点 → B（良）
//  2番:  92点 → A（優）
//  3番:  47点 → F（不合格）
//  4番:  63点 → C（可）
//  5番:  78点 → B（良）
//  6番:  55点 → F（不合格）
//  7番:  99点 → A（優）
//  8番:  34点 → F（不合格）
//  9番:  71点 → B（良）
// 10番:  88点 → B（良）