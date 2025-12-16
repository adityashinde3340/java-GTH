public class Q70 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j) + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(64 + j) + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j) + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(64 + j) + " ");
            }
            System.out.println();
        }
    }
}