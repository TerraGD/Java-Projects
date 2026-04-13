import java.util.Scanner;

class MovieRatings {
    public static void main(String[] args) {

        Double[][] movieReview = new Double[6][4];
        String[] Ages = new String[4];

        Scanner scan = new Scanner(System.in);

        // Age ranges 
        Ages[0] = "1-10";
        Ages[1] = "11-20";
        Ages[2] = "21-30";
        Ages[3] = "31-40+";

        // Nums
        System.out.println("Enter your 24 Ratings (1.0-10.0): ");
        for (int row = 0; row < movieReview.length; row++) {
            for (int col = 0; col < movieReview[row].length; col++) {
                movieReview[row][col] = scan.nextDouble();
            }
        }

        // Age Groups
        for (int col = 0; col < Ages.length; col++) {
            System.out.print(Ages[col] + "\t");
        }

        System.out.println();
        System.out.println("-------------------------------");

        // Display table 
        for (int row = 0; row < movieReview.length; row++) {
            for (int col = 0; col < movieReview[row].length; col++) {
                System.out.print(movieReview[row][col] + "      ");
            }
            System.out.println(); 
        }
        
        // Averages
        for (int row = 0; row < movieReview.length; row++){
            double sum = 0;
            for (int col = 0; col < movieReview[row].length; col++) {
                sum += movieReview[row][col];
            }
            double average = sum / movieReview[row].length;
            System.out.println("Average Rating of Movie " + (row + 1) + " is " + average);
        
        }
        // Highest Rating
        System.out.println();
        for (int col = 0; col < movieReview[0].length; col++) {
            int count = 0;
            for (int row = 0; row < movieReview.length; row++) {
                if (movieReview[row][col] > 7.0) {
                    count++;
                }
            }
            System.out.println("Age Group " + (col + 1) + " rated " + count + " movies above 7.0");
            
        }

        scan.close();
    }
}
