import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Plotter {
	
	public static double function(double x) {
		double y;
		y = (1*x) + 2; 
		return y;
	}
	//implemented my csv exporter; in this program, it exports the x values and randomly generated y values
	//based on my selected function above
	private static void exportCsv(ArrayList<String> combined) {	
				
	    try{
	        FileWriter file = new FileWriter("Plotted Excel.csv");
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
	
	
		for (int i = 0 ; i < range; i++) {
			double xValue = 0 + i;
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