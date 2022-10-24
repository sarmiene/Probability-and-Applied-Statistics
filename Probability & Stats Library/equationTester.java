
public class equationTester {
	public static void main(String[] args) {
		double n = 10;
		double r = 2;
		double p = 5;
		double x = 4;
		double q = 8;
		double y = 7;
		double z = 5;
		
	
		equations eq = new equations();
		

		double perm1 = eq.permutation(n,r);
		double comb1 = eq.combination(n, r);
		double binom1 = eq.binomial(n, r, p, q);	
		double geo1 = eq.geometric(n,p,q,r); 
		double hyper1 = eq.hypergeometric(n,p,y,x); 
		double pois1 = eq.poisson(n,z);
		
		
		System.out.println("Given the following variables: ");
		System.out.println("Permutation: " + perm1);
		System.out.println("Combination: " +comb1);
		System.out.println("Binomial: " +binom1);
		System.out.println("Geometric: " +geo1);
		System.out.print("Hypergeometric: " +hyper1);
		System.out.println("Poisson: " +pois1);
		
	}
	
	
}


