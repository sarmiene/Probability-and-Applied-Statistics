

public class Card {

	
	public int rank;
	public int suit;
	
	public Card ( int inputRank, int inputSuit) {
		rank = inputRank;
		suit = inputSuit;		
	}
	public int getRank() {
		return rank;
	}
	public int getSuit() {
		return suit;
	}
	
	public void setRank(int number ) {
		this.rank = rank;
	}
	
	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public String toString() {
		return suit + " " +rank;
	}
}