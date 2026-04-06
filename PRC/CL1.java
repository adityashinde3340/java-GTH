class A1{
    int id;
    static int name;
    int opr(int n){
      return n + 10;
    }
}

public class CL1{
    public static void main(String x[]){
        System.out.println("------CL1------");
        A1 obj = new A1();
        System.out.println(obj.id);
        System.out.println(obj.name);
        int res = obj.opr(10);
        System.out.println(res);
    }
}
