import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class FishMarket {
	
public static void main(String[] args) {
	
	//array list of seafood types
	ArrayList<Seafood> seafoods = new ArrayList<Seafood>();
	
	//loop the method generating random types of seafood from fish,crab, scallop, and shrimp
	for(int i = 0; i<300; i++) {
		seafoods.add(FishMarket.generateSeafood());
	}
	
	for (int i = 0; i <seafoods.size(); i++) {
		System.out.println(seafoods.get(i).toString());
	}

	exportCsv(seafoods);
}
// method to generate random seafood
	public static Seafood generateSeafood(){
		Random ran = new Random();
		double weight = ran.nextDouble(5);
		
		int n = ran.nextInt(4);
		
		//using switch case to randomly select either fish,crab, scallop, or shrimp using a random based variable (alternatively can use if/else)
		switch(n) {
		case 0:
			return new Fish(weight);		
		case 1:
			return new Crab(weight);		
		case 2:
			return new Scallop(weight);			
		case 3:
			return new Shrimp(weight);					
		}
		return null;	
	}


private static void exportCsv(ArrayList<Seafood> seafoods) {	
	
	

	//creates a csv file, writes the arraylist of seafood generated randomly, store the values 
    try{
        FileWriter file = new FileWriter("seafood.csv");
        file.append("Type,Weight,Price per lb");
        file.append("\n");
        BufferedWriter bwriter = new BufferedWriter(file);
        PrintWriter write = new PrintWriter(bwriter);
        for (Seafood name: seafoods){
        write.println(name);
        write.flush();
    }
    write.close();
}
catch(IOException exe){
    System.out.println("File was not created");
}
}

/*private static void importCsv() {
	
	ArrayList<Seafood> newseafood = new ArrayList<Seafood>();
	String file = "seafood.csv";
	
	try{
      BufferedReader br = new BufferedReader(new FileReader(file)); 
    	  String line = "";
      while ((line = br.readLine()) != null) {
    	  newseafood.add(line.split(","));
    	  
    	  
      }
    }
  
catch(IOException exe){
    System.out.println("File was not created");
	
}*/
}

	


