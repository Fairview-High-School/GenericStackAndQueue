import java.util.Scanner;

public class ReversePolishCalculator
{
    public static void main(String[] args)
    {
        Stack<Double> expressionStack = new ArrayListStack<Double>();
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        do
        {
            System.out.println("Enter number, math operation(+,-,*, or /), or Q to quit:");
            input = keyboard.nextLine().trim();

            
        }while (!input.toUpperCase().trim().equals("Q"));
        
        
        
        
    }
}
