import java.util.Scanner;  

class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter the height (in meters) and weight (in kg): ");
        double height = s.nextDouble();  
        double weight = s.nextDouble();  
        double bmi = weight / Math.pow(height, 2);  
        System.out.println("The BMI is: " + bmi);  
    }
}
