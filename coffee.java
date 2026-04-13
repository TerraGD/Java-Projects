

public class coffee
{
    public static void main(String[]args){
        String customerName = "Marcus";  
        int numberOfCoffees = 67;
        int pricePerCoffee = 5;
        
        int totalPrice = numberOfCoffees * pricePerCoffee;
        
        System.out.println("Here's your receipt: " + customerName);
        System.out.println("Number of Coffees Ordered: " + numberOfCoffees);
        System.out.println("Total Price: $"+totalPrice);
    }
}