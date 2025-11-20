public class MCQ39 {
    public static void main(String[] args) {
        int a = 1;
        a = a++ + ++a * a++ + --a;
        System.out.println(a);
    }
}