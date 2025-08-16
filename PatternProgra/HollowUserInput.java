package PatternProgra;
import java.util.Scanner;
public class HollowUserInput {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Take user input for the size of the square
	        System.out.print("Enter the size of the hollow square: ");
	        int size = scanner.nextInt();

	        // Print the hollow square
	        printHollowSquare(size);
	    }

	    static void printHollowSquare(int size) {
	        for (int i = 1; i <= size; i++) {
	            for (int j = 1; j <= size; j++) {
	                // Print '*' for the outer border and the inner hollow space
	                if (i == 1 || i == size || j == 1 || j == size) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  "); // Print space for the hollow part
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
}
