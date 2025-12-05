public class Q19 {
    public static void main(String[] args) {
        int rows = 6;
        int spaces = 0;

        for (int i = rows; i >= 1; i--) {

            for (int s = 0; s < spaces; s++) {
                System.out.print("-");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) System.out.print("   ");
            }

            spaces += 2;
            System.out.println();
        }
    }
}
