import java.lang.Math;
 
public class VarianceStandardDeviation {
 
    // Function for calculating variance
    static double variance(double dataSet[], int n) {
        double sum = 0;
        
        //sum of data set 
        for (int i = 0; i < n; i++) {
            sum += dataSet[i];
        }
        //mean of data set
        double mean = sum /n;
     
        // Sum of deviations to the square
        double devSqu = 0;
        for (int i = 0; i < n; i++) {
        	devSqu += Math.pow((dataSet[i] - mean),2);
        }
        return devSqu / n;
        
    }
    
    //Function for calculating Standard Deviation 
    static double standardDeviation(double dataSet[], int n){
    	return Math.sqrt(variance(dataSet, n));
    }
     
    public static void main (String[] args) {
     
    double dataSet[] = {10, 40, 25, 17, 22, 15, 7, 19};
    int n = dataSet.length;
	
    System.out.println("Data Set");
    for (double i : dataSet) {
		System.out.print(i + " ");
		}
    
	System.out.println("\n");
    System.out.println( "Variance: " + variance(dataSet, n));
    System.out.println ("Standard Deviation: " + standardDeviation(dataSet, n));
     
    }
}