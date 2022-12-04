import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//Using Apache Stats Library to smooth
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;



public class Smoother {
	
	
	
	//my implemented csv importer
	public ArrayList<Double> csvImporter() throws IOException {
		
		
        String line = "";
        String splitBy = ",";
        ArrayList<Double> yNums = new ArrayList<>();
        
            
        BufferedReader br = new BufferedReader(new FileReader("Salted Plotted Excel.csv"));           
        while ((line = br.readLine()) != null)   
        {
        		String[] nums = line.split(splitBy);       	
        		double yNum = Double.parseDouble(nums[1]);
        		yNums.add(yNum);     		
        }
        return yNums;
	}
	
	
	public double[] ySmoother(int x) throws IOException {		
		ArrayList<Double> yValue = csvImporter();			
		double[] smoothedY = new double[yValue.size()];
		DescriptiveStatistics stats = new DescriptiveStatistics();
		ArrayList<Double> finalY = new ArrayList<Double>(); 
		
	//Implementation of the Apache stats Library using DescriptiveStatistics		
		for(int i = 0; i < yValue.size(); i++) {
			stats.addValue(yValue.get(i));
			finalY.add(stats.getMean());
		}	
			for(int i = 0; i < finalY.size(); i++) {
			smoothedY[i] = finalY.get(i) + i/2;		
	}
		System.out.println(finalY);
		return smoothedY;	
	}
}