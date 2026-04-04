public class RECC2 {
    static int factorial(int n) {
        if (n == 0 || n == 1) {   // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        int num[] = new int[5];
        num[3] = 3;
        for(int i = 0 ; i < num.length; i++){
        if(num[i] == 0){
           continue;
        }
        else{
        System.out.print(num[i]+" ");
        }
        
        }
    }
}
