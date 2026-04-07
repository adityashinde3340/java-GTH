public class PR01{
   public static void main(String x[]){
       
       Object[] obj = new Object[3];
       
       obj[0]=100;
       obj[1]="hello";
       obj[2]=true;
       
       for(int i = 0 ; i < obj.length ; i++){
          System.out.println(obj[i]+" ");
       }
       
   }
}
