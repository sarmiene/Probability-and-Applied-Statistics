public class tester {

public static void main(String[] args) {
		
	
		birthday bd = new birthday();
		
		
		int classResult = bd.classSize();
		int testResult = bd.testSize();
		
	    	    
		double sameBday = 0;
		
		//Number of Runs to find 2 match birthdays 
		for (int i = 0; i <testResult; i++) {
			if (bd.people(classResult)) {
				sameBday++;
				}
			}
		
		//Calculates Probability
		double results = (sameBday / testResult);
		
		System.out.println("Class Size: " + classResult);
		System.out.println("Number of Runs: " + testResult);
		System.out.println("Probability of two people sharing a birthday: " + results);


	}
}
