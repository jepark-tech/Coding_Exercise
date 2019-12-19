package codingExercise;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int aTimes1000 = (int)(a * 1000);
        int bTimes1000 = (int)(b * 1000);
        if(aTimes1000 == bTimes1000){
            return true;
        }
        else return false;
    }
}
