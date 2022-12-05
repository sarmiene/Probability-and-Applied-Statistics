import java.util.ArrayList;


public class HandEval {
	
	Deck deck = new Deck();
			
	
     public void numTrials(int trials) {
    	 
    	    
	        int isPairWins = 0;	        
	        int threeSameWins = 0;
	        int fourSameWins = 0;
	        int all5Suitewins = 0;
	        int straightWins = 0;
	        int pairAndThreeWins = 0;
	        int twoPairWins = 0;
	        int straightSameSuiteWins = 0;
	        int rareWins = 0;   
	        int none = 0;
		
 
		for(int i = 0; i < trials; i++) {
					
		Deck deck = new Deck();
			ArrayList<Card> hand = new ArrayList<>();
	
			for(int j = 0; j < 5; j++) {
				hand.add(deck.draw());
			}

			if(deck.isPair(hand)) {
                isPairWins++;	
            }            
           
            if(deck.isThreeSame(hand)){
            	threeSameWins+=5;		
            }
            
            if(deck.isFourSame(hand)){
            	fourSameWins++;	
            }
			if(deck.isAll5Suites(hand)){
				all5Suitewins++;
			}
	
            if(deck.isPairAndThree(hand)){
                pairAndThreeWins++;		
            }
            
            if(deck.isTwoPair(hand)){
                twoPairWins++; 
            }
            if(deck.isStraight(hand)){
                straightWins++;		
            }
            if(deck.isStraightSameSuite(hand)){
                straightSameSuiteWins++;		
            }
            if(deck.isRare(hand)){
            	rareWins++;		 
            }
            else {
            	none++;
		}
		
        }
        System.out.println("Results of 100,000 Trials:");
        System.out.println("");
        System.out.println("1. Two of the same card: "+ isPairWins/(0.01*trials) + "%");
        System.out.println("2. Three of the same card: "+ threeSameWins/(0.01*trials) + "%");          
        System.out.println("3. Four of the same card: "+ fourSameWins/(1.0*trials));         
        System.out.println("4. All 5 cards are same suite: " + all5Suitewins/(0.01*trials) + "%");
        System.out.println("5. Pair and three of a kind: "+ pairAndThreeWins/(0.01*trials) + "%");
        System.out.println("6. Two Pair (Not same rank): "+ twoPairWins/(0.01*trials) + "%");
        System.out.println("7. Cards ordered without a skip: "+ straightWins/(0.01*trials) + "%");  
        System.out.println("8. All cards straight and same suite: "+ straightSameSuiteWins/(0.01*trials) + "%");
        System.out.println("9. Rare case of A,J,Q,K,10 of same suite: "+ rareWins/(0.01*trials) + "%");  
        System.out.println("10. If there is none of the above: " + none/(0.1*trials)+"%");
	
     }
}

