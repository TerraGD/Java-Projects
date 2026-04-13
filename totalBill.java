
/**
 * Write a description of class totalBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class totalBill
{
    public static void main(String[]args){ 
        int price = 30;
        double taxRate = 0.05;
        
        double totalBill = (price * taxRate) + price;
        
        System.out.println("Your total is: $" + totalBill);
    }
}