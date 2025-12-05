public class Q20 {
    public static void main(String[] args) {
        int n = 11;   // keep odd for perfect center

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n-1 || j == 0 || j == n-1 ||
                    i == j || i + j == n-1 ||
                    (i == n/2 && j == n/2)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
