package codingExercise;

import java.util.Scanner;

public class InputCalculator {
	public static void main(String [] args) {
		inputThenPrintSumAndAverage();
	}
	
    public static void inputThenPrintSumAndAverage () {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        while (scan.hasNextInt()) {
        		int num = scan.nextInt();
            	sum += num;
            	count ++;
        }
        scan.close();
        long average = Math.round((double)sum / count);
        
        System.out.println("SUM = " + sum + " AVG = " + average);
        
    }
}
