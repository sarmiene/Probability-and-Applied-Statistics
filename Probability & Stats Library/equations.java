import java.lang.Math;

public class equations {

	public static double factorial(double n){
        if( n == 1 || n == 0){
            return 1;
        }
        return (n * factorial(n-1));
    }
	
	public static double permutation(double n, double r) {
		double perm= factorial(n) / factorial(n-r);
		
		return perm;
		
	}
	
	public static double combination( double n, double r) {
		double comb = factorial(n)/(factorial(r) * factorial(n-r));
		return comb;
	}
	
	public static double binomial(double n, double r , double p, double q) {
	
		double binom = combination(n,r)*(Math.pow(p,r)*(Math.pow(q,n-r)));
		return binom;
		
	}
	
	public static double geometric(double n, double p, double q, double r) {
		
		double geo = (Math.pow(q, r-1))*p;
		return geo;
		
	}
	
	public static double hypergeometric(double n, double p, double y, double x) {
		
		double hyper =  ((combination(n,p)*(combination(y-n,x-p))/combination(y,x)));
		return hyper;
	}
	
	public static double poisson(double n, double z) {
		
		double pois = Math.pow(n,z)/factorial(z)*(Math.pow(2.7182818,-z));
		return pois;
		
		
	}
	

	
}