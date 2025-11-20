public class MCQ49 {
    public static void main(String[] args) {
        int a = 4;
        System.out.println((a &= 3) + (a |= 2) + (a ^= 1));
    }
}