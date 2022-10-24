import java.util.Random;

public class Seafood {
	
protected double weight = 0;
protected double perlb = 0.0;
protected String name;

public Seafood() {
	this.weight = 0;
	this.perlb = 0;
	this.name = "";
}


//to string to print out name, weight, and priceperlb of each unique seafood
@Override
public String toString(){
return  name +"," +weight+","+ perlb;

}
}

