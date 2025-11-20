//Q6. Write a java program to enter length in centimeter and convert 
//into meter and kilometer.

public class PR1 {
    public static void main(String x[]) { 
        int lengthInCm = 250000;

        float lengthInMeter = lengthInCm / 100.0f;    
        float lengthInKm = lengthInCm / 100000.0f;    

        System.out.println("Length in Centimeter = " + lengthInCm);
        System.out.println("Length in Meter = " + lengthInMeter);
        System.out.println("Length in Kilometer = " + lengthInKm);
    }
}
