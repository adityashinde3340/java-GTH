import java.util.*;
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next().toLowerCase();
        switch(color){
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Color");
        }
    }
}
