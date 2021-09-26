import java.util.Scanner;

public class Leibniz_Formula {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the sum detailing of Leibniz formula for pi/4");
        System.out.println("Please enter the number you want us to calculate the value of pi/4 to.");
        double num = scanner.nextDouble();
        Leibniz(num);
    }


    public static double Leibniz(double num)
    {
        double sum = 0; // Starts the sum at 0 to add into it.
        double denominator = 1; // This will be the original odd denominator
        for(int x = 0; x < num; x++)
        {
            if(x % 2 == 0)
            {
                sum = sum + (1 / denominator); // if the current value of x is even, then a number will be added.
            }
            else
            {
                sum = sum - (1 / denominator); // if the value of x is odd, and then a number will be subtracted.
            }
            denominator = denominator + 2; // The denominators  are all odds starting at one so a 2 is always added.
        }
        System.out.println("This is the value of pi/4 as calculated by our leibniz sum. " + sum); //This outputs the result to the user.
        return sum; //This returns the value that was calculated.
    }




}
