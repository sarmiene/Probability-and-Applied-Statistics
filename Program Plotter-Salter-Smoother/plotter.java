import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class plotter {
	
	public static double function(double x) {
		double y;
		y = (10*x) + 5; 
		return y;
	}
	
	private static void exportCsv(ArrayList<String> combined) {	
				
	    try{
	        FileWriter file = new FileWriter("plotted.csv");
	        file.append("X Values, Y Values");
	        file.append("\n");
	        BufferedWriter bwriter = new BufferedWriter(file);
	        PrintWriter write = new PrintWriter(bwriter);
	        for (String num: combined){
	        write.println(num);
	        write.flush();
	    }
	    write.close();
	}
	catch(IOException exe){
	    System.out.println("File was not created");
	}
}
	
	public static void main (String[] args) {
		ArrayList<Double> xvalues = new ArrayList<Double>();
		ArrayList<Double> yvalues = new ArrayList<Double>();
		ArrayList<String> combined = new ArrayList<String>();
		double range = 100;
		
		Random rand = new Random();
	
		for (int i = 0 ; i < range; i++) {
			double xValue = rand.nextDouble(10);
			xvalues.add(xValue);
		}
		for (int i = 0; i<xvalues.size(); i++) {
			double x = xvalues.get(i);
			yvalues.add(function(x));			
		}
		System.out.println(xvalues);
		System.out.println(yvalues);	
		
		for (int i = 0; i < xvalues.size(); i++) {
			combined.add(xvalues.get(i)+ ","+ yvalues.get(i));
			
		}
	exportCsv(combined);
		
	}
	
}