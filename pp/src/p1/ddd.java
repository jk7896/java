package p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class ddd {

	    private static final int TOTAL_BALLS = 45; // Total number of lottery balls (1-45)
	    private static final int NUM_SELECTED_BALLS = 6; // Number of balls to select (6 for Korean lottery)

	    public static void main(String[] args) {
	        Random random = new Random();
	        ArrayList<Integer> selectedNumbers = new ArrayList<>();

	        while (selectedNumbers.size() < NUM_SELECTED_BALLS) {
	            int randomNumber = random.nextInt(TOTAL_BALLS) + 1; // Generate random number between 1 and 45

	            if (!selectedNumbers.contains(randomNumber)) { // Check if number is already selected
	                selectedNumbers.add(randomNumber); // Add unique number to the list
	            }
	        }

	        Collections.sort(selectedNumbers); // Sort the selected numbers in ascending order

	        System.out.println("Generated Lottery Numbers: " + selectedNumbers);
	    }
	
}
