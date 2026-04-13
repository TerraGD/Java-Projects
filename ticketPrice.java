
public class ticketPrice
{
        public static void main(String[]args){
            int age = 19;
            int price = 0;
            
            if (age < 12){
                price = 5;
            } else if(age >= 12 && age <= 59){
                price = 10;
            } else if (age >= 60) {
                price = 7;
            }
            
            System.out.println("You are "+ age +" years old.");
            System.out.println("Your ticket will be: $"+ price);
        }
}