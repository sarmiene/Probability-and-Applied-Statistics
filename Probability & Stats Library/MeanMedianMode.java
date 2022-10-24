import java.util.Arrays;

public class MeanMedianMode
{
    // Function for calculating mean
    public static double findMean(int dataSet[], int n)
    {	
        int sum = 0;
        
        //sum of data set
        for (int i = 0; i < n; i++)
            sum += dataSet[i];
       
        //mean of data set
        return sum / n;
    }
 
    // Function for calculating median
    public static double findMedian(int dataSet[], int n)
    {
        // Sort array numerically 
        Arrays.sort(dataSet);
 
        // if sample size is even number
        if (n % 2 != 0)
            return dataSet[n / 2];
        else 
        	return (dataSet[(n - 1) / 2] + dataSet[n / 2]) / 2;
    }
    
    //Function for calculating Mode
    public static double findMode(int dataSet[], int n) {
        int mode = 0, mostNum = 0, i, j;

        for (i = 0; i < n; ++i) {
           int count = 0;
           for (j = 0; j < n; ++j) {
              if (dataSet[j] == dataSet[i])
              ++count;
           }

           if (count > mostNum) {
        	  mostNum = count;
              mode = dataSet[i];
           }
        }
        return mode;
    }
    
    public static void main(String args[])
    {
        int dataSet[] = { 10,5,6,2,20,20 };
        int n = dataSet.length;
        
        System.out.println("Data Set");
		for (double i : dataSet) {
			System.out.print(i + " ");
			}

        System.out.println("\n" + "\nMean = " + findMean(dataSet, n));
        System.out.println("Median = " + findMedian(dataSet, n));
        System.out.println("Mode = " + findMode(dataSet,n));

    }
}