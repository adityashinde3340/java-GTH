public class MCQ27 {
    public static void main(String[] args) {
        int a = 5;
        a += a++ + ++a + --a;
        System.out.println(a);
    }
}