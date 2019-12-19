package codingExercise;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        }
        else {
            double milesPerHour = (1 / 1.609) * kilometersPerHour;
            return Math.round(milesPerHour);
        }
    }
    
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            double milesPerHour = (1 / 1.609) * kilometersPerHour;
            long roundedMilesPerHour = Math.round(milesPerHour);
            System.out.println(kilometersPerHour + " km/h = " 
                               + roundedMilesPerHour + " mi/h");
        }
    }
}