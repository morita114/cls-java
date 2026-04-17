public class SwitchFallThrough {
    public static void main(String[] args) {
        int x = 1;

        switch (x) {
            case 0:  System.out.println("表示されない"); break;
            case 1:  System.out.println("ここだけ表示したい");  // breakなし
            case 2:  System.out.println("ここも表示されてしまう");
            default: System.out.println("ついでにここも");
        }

        switch (x) {
            case 0 ->  System.out.println("表示されない");
            case 1 ->  System.out.println("breakなしでもここだけ表示");
            default -> System.out.println("表示されない");
        }
    }
}

