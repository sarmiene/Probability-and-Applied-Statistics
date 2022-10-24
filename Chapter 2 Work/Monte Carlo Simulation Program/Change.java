import java.util.Random;

public class Change {

	
	public void ChangeDOOR() {
		
    Random rand = new Random();
    int trials = 10000;
    int wins = 0;
		
    //for looping through 10,000 trials
	for (int i = 1; i <= trials; i++) {
	     int winningDoor = rand.nextInt(3);
	     int pickedDoor = rand.nextInt(3);

	     int losingDoor = winningDoor;
	     while (losingDoor == winningDoor ||
	            losingDoor == pickedDoor) {
	            losingDoor = rand.nextInt(3);
	           }

	      int differentDoor = 3 - (pickedDoor + losingDoor);
	      if (differentDoor == winningDoor) {
	                wins++;	       
	        }
	}
	 System.out.println("CHANGE IN DOOR PICKED: ");
	 System.out.println("Total Wins out of 10,000 Trials: "+wins);
	 System.out.println("Win percentage: "+ (double)wins/trials);
	 }	
}
