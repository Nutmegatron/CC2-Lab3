// Carlinbhert Adryanne De Guzman
// CITCS 1N - A
// September 12, 2024
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {


//        created groceryCalc scanner to get user input
        Scanner groceryCalc = new Scanner(System.in);

//        created double variables for the item quantities/prices
        double firstItemPrice, firstItemQuant, secondItemPrice, secondItemQuant, thirdItemPrice, thirdItemQuant;

//        first item's price is inputted using integers
        System.out.print("Enter the price of bananas: ");
        firstItemPrice = groceryCalc.nextDouble();

//        nextLine method is used so user can input more values
        groceryCalc.nextLine();

//        first item's quantity is inputted using integers
        System.out.print("Enter the quantity of bananas: ");
        firstItemQuant = groceryCalc.nextDouble();

        groceryCalc.nextLine();;

        System.out.print("Enter the price of bottled water: ");
        secondItemPrice = groceryCalc.nextDouble();

        groceryCalc.nextLine();

        System.out.print("Enter the quantity of bottled water: ");
        secondItemQuant = groceryCalc.nextDouble();

        groceryCalc.nextLine();

        System.out.print("Enter the price of chips: ");
        thirdItemPrice = groceryCalc.nextDouble();

        groceryCalc.nextLine();

        System.out.print("Enter the quantity of chips: ");
        thirdItemQuant = groceryCalc.nextDouble();

        groceryCalc.nextLine();

//        created double variables for the calculated outputs
        double subTotal, discount, salesTax, finalTotal;

//        Subtotal is calculated using previously created variables
         subTotal = (firstItemPrice * firstItemQuant) + (secondItemPrice * secondItemQuant) + (thirdItemPrice * thirdItemQuant);
//        Discount is calculated by using subTotal variable and getting 5 percent
         discount = (subTotal * 0.05);
//        Sales Tax is calculated by subtracting Subtotal from Discount and getting 12 percent
         salesTax = ((subTotal - discount) * 0.12);
//        Final Total is calculated by adding Sales Tax and the subtraction of Subtotal and Discount
         finalTotal = (salesTax + (subTotal - discount));

//        Output is printed on new lines
        System.out.println("Subtotal: PHP " + subTotal);
        System.out.println("Discount: PHP " + discount);
        System.out.println("Sales Tax: PHP " + salesTax );
        System.out.println("Final Total: PHP " + finalTotal);



    }

}