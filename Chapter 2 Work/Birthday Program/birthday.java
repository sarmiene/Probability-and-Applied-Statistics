import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class birthday {
	
	public static boolean people(int classSize) {
		int daysYr = 365;
		boolean[] bDay = new boolean[daysYr];

		//Checking birthday matches
		for (int i = 0; i < classSize; i++) {
			int j = ThreadLocalRandom.current().nextInt(bDay.length); 
			if (bDay[j]) { 
				return true;
				}
			bDay[j] = true;
			}
		return false;
		}
	
	public int classSize() {
		Scanner size = new Scanner(System.in);
	    System.out.println("Enter Class Size: ");  
	    Integer classSize = size.nextInt(); 
	    
	    return classSize;
		}
	
	public int testSize() {
	    Scanner runs = new Scanner(System.in);
	    System.out.println("Enter Number of Runs: "); 
	    Integer numRuns = runs.nextInt();
	    
	    return numRuns;
	}
 }