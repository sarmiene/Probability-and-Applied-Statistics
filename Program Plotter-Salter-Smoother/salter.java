import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;  



public class salter 
{  
public static void main(String[] args)   
{  
String line = "";  
String splitBy = ",";  
ArrayList<String> xvalues = new ArrayList<String>();
ArrayList<String> yvalues = new ArrayList<String>();

double range = 5;

Random randy = new Random();
Double rany = randy.nextDouble(range);
try   

{  
BufferedReader br = new BufferedReader(new FileReader("Plotted Excel.csv"));  
while ((line = br.readLine()) != null)  
{  
String[] nums = line.split(splitBy);   
xvalues.add(nums[0]);
yvalues.add(nums[1]);
}  


double[] xvalue = new double[xvalues.size()]; 
for (int i = 0; i < xvalues.size(); ++i) { 
    xvalue[i] = Double.parseDouble(xvalues.get(i));     
}    
    
double[] yvalue = new double[yvalues.size()]; 
for (int i = 0; i < yvalues.size(); ++i) { 
      yvalue[i] = Double.parseDouble(yvalues.get(i));       
}

for ( int i = 0; i <yvalue.length; i++) {
	double saltedy = yvalue[i] + rany;	
}
System.out.println(xvalues);
System.out.println(yvalues);
}   
catch (IOException e)   
{  
e.printStackTrace();  
}


}  
} 