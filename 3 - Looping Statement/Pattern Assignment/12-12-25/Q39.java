public class Q39{
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
            if (i < 5) {
                System.out.print("* ");
            }
            if (i <= 4) {
                System.out.print(i + " ");
            }
            if (i < 4) {
                System.out.print("* ");
            }
            if (i <= 3) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}