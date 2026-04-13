import java.util.Scanner;
import java.util.ArrayList;

public class MovieViewCounts{
    public static void main(String[] args) {
        // Test Data: 1250 890 2018 675 1450 3200 550 1820 2750 920
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> viewCounter = new ArrayList<>();
        
        //Scan and prints #
        System.out.print("Input 10 View Counts: ");
        for (int i = 0; i < 10; i++) {
            int views = scan.nextInt();   // Correct method
            viewCounter.add(views);       // Store integer
        }
        System.out.println();
        
        
        // Lowest #
        int lowest = viewCounter.get(0);
        for (int x : viewCounter ){
            if (x < lowest){
                lowest = x;
            }
        }
        System.out.println("Lowest View Count: " + lowest);
        
        // Average
        int sum = 0;
        for (int x = 0; x < 10; x++ ){
            sum += viewCounter.get(x);
        }
        int average = sum/10;
        System.out.println("Average View Count: " + average);
        System.out.println();
        
        // Insert New Number
        System.out.print("Pick an index to insert at (0 to 10): ");
        int index = scan.nextInt();
        if (index <= viewCounter.size()) {
            System.out.print("Enter new view count: ");
            int newCount = scan.nextInt();
            viewCounter.add(index, newCount);
            System.out.println("Updated View Counts: " + viewCounter);
            System.out.println();
        }
        
        
        
        //Change Number
        System.out.println("Change a View Count (0 to 10): ");
        for (int v = 0; v < viewCounter.size(); v++) {
            System.out.println(v + " - " + viewCounter.get(v));
        }
        System.out.print("Enter to change Index: ");
        int indexNew = scan.nextInt();
        System.out.print("Set New View Count: ");
        int newCount = scan.nextInt();
        System.out.print("New View Count: ");
        viewCounter.set(indexNew, newCount);
        System.out.println(viewCounter);
        System.out.println();
        
        //Remove Number
        System.out.print("Remove  an index at (0 to 10): ");
        int indexRemove = scan.nextInt();
        System.out.print("New View Count: ");
        viewCounter.remove(indexRemove);
        System.out.println(viewCounter);
        scan.close();
    }
}


