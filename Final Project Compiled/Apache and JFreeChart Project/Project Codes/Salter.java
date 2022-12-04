import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;  



public class Salter 
{  
	
	//my implemented csv exporter
	private static void exportCsv(ArrayList<String> combined) {	
		
	    try{
	        FileWriter file = new FileWriter("Salted Plotted Excel.csv");
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
	
public static void main(String[] args)   
{  
String line = "";  
String splitBy = ",";  

ArrayList<Double> xvalues = new ArrayList<Double>();
ArrayList<Double> yvalues = new ArrayList<Double>();
ArrayList<Double> ysalted = new ArrayList<Double>();
ArrayList<String> combined = new ArrayList<String>();


Random randy = new Random();

try   

{  
BufferedReader br = new BufferedReader(new FileReader("Plotted Excel.csv"));  
while ((line = br.readLine()) != null)  
{  
String[] nums = line.split(splitBy);   
double yNum = Double.parseDouble(nums[1]);

yvalues.add(yNum);
}     

double range = 100;

for (int i = 0 ; i < range; i++) {
	double xValue = 0 + i;
	xvalues.add(xValue);
}

double[] yvalue = new double[yvalues.size()]; 
for (int i = 0; i < yvalues.size(); ++i) { 
      yvalue[i] = yvalues.get(i);       
}


//Implementing a random double number generation to add to the y values with range of -10 to 10
for ( int i = 0; i <yvalue.length; i++) {
	Double rany = ThreadLocalRandom.current().nextDouble(-10,10);
	double saltedy = yvalue[i] + rany;	
	ysalted.add(saltedy);
	
	System.out.println(saltedy);
}

for (int i = 0; i < xvalues.size(); i++) {
	combined.add(xvalues.get(i)+","+ysalted.get(i));
}
System.out.println(yvalues);
}   
catch (IOException e)   
{  
e.printStackTrace();  
}

exportCsv(combined);

}  
} 