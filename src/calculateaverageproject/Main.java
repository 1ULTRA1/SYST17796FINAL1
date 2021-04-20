
package calculateaverageproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First input");
        double one = input.nextDouble();
        System.out.println("Second input");
        double two = input.nextDouble();
        System.out.println("Third input");
        double three = input.nextDouble();   
        System.out.println(calculateAverage(one, two, three));
    }
    static double calculateAverage(double num1, double num2, double num3){
        double result = (num1 + num2 + num3) / 3;
        return result;                
    }
    
}
