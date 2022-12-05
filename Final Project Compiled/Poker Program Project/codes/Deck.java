import java.util.ArrayList;
import java.util.Random;

public class Deck {

	public ArrayList<Card> deckOfCards = new ArrayList<>();


	public Deck() {
		
		for(int i = 0; i < 13; i++) { 
			for(int j =0; j < 4; j++) { 
				Card temp = new Card(i,j);
				deckOfCards.add(temp);
				
			}
		}
	}
	
	public Card draw() {
		
		if (deckOfCards.size() > 0) {
			
			Random rng = new Random(); 
			int decksRandomCard = rng.nextInt(deckOfCards.size());
			Card singleCard = deckOfCards.get(decksRandomCard);
			deckOfCards.remove(decksRandomCard);
			
			return singleCard;
		}
		return null;
	}
	 //1. If there are two of the same card, you can return true, and this method is to search "pair
	public boolean isPair(ArrayList<Card> hand) {
        int number = 0;
        for(Card singleCard : hand){
        for(Card singleCard2 : hand) {   
              if(singleCard.getRank() == singleCard2.getRank()) {
                    number++; 
       
                     }if (number == 2) {
                         return true;
                     }
                 }
        		number = 0;
        	}
           
        return false;
	}   
	
	  //2. If there are three of the same card
	 public boolean isThreeSame(ArrayList<Card> hand) {
			int number = 0;
		   	int count = 0;
		       for(Card singleCard : hand){
		       for(Card singleCard1 : hand) {
		       for(Card singleCard2 : hand) {
			   int a = singleCard.getRank();
			   int b = singleCard1.getRank();
			   int c = singleCard2.getRank();
			          
			           if(a == b && a == c && b == c) {
			               count ++;
			            
			               }if (count == 3) {
			               	return true;
			               }
			           if (a == number) {
			               	return true;
			               }
			           else if (number != a) {
			                   return false;
			               }
			           }
			       	}
		       }
		       return true; 
		  } 
	 
	 //If there are four of the same card
	 public boolean isFourSame(ArrayList<Card> hand) {
			int number = 0;
		   	int count = 0;
		       for(Card singleCard : hand){
		       for(Card singleCard1 : hand) {
		       for(Card singleCard2 : hand) {
		       for(Card singleCard3 : hand) {
		       		
			   int a = singleCard.getRank();
			   int b = singleCard1.getRank();
			   int c = singleCard2.getRank();
			   int d = singleCard3.getRank();
			           
			           if(a == b && c == d) {
			               count ++;
			            
			               }if (count == 4) {
			               	return true;
			               }
			           	if (a == 0) {
			               	return true;
			               }
			            else if (number != a) {
			                   return false;
			               }
			           }
			       	}
		       }
		       }
		       	return true; 
		      }
	
	 //If all 5 suites are the same suite
	public boolean isAll5Suites(ArrayList<Card> hand) {
		
		int suit = -1;
		
		for(Card singleCard : hand) {
			
			int tempSuit = singleCard.getSuit();
			
			if(suit == -1) {
				suit = tempSuit;
			} else if (suit != tempSuit) {
				return false;
			}
		}
		return true;
	}
	
	// If there is a pair and a three of a kind 
    public boolean isPairAndThree(ArrayList<Card> hand) {
    	int pair = 0;
    	int triple = 0;
    	int count = 0;
        for(Card singleCard : hand){
        for(Card singleCard1 : hand) {
        for(Card singleCard2 : hand) {
        for(Card singleCard3 : hand) {
        for(Card singleCard4 : hand) {
        int a = singleCard.getRank();
        int b = singleCard1.getRank();
        int c = singleCard2.getRank();                			
        int d = singleCard3.getRank();
        int e = singleCard4.getRank();
                			
	            if(a == b && c == d && e == c) {
	                count ++;
	             
	                }if (count ==5) {
	                	return true;
	                }
	            	
	                if (a == pair) {
	                	return true;
	            	}
	                
	            	if (c == triple) {
	            		return true;
	            		}
	            	else if(pair != a && triple != c) {
	            			return false;
	            		}
	           }
	         }
	       }
         }
        }
        return true;
    }
     

    //If there is two pairs (not of same rank)    
	public boolean isTwoPair(ArrayList<Card> hand) {
	    int number = 0;
	    int count = 0;
	    for(Card singleCard : hand){
	    	for(Card singleCard1 : hand) {            
	        int a = singleCard.getRank();
	        int b = singleCard1.getRank();
	        
	        
	        if(a == b) {
	            count++;
	         
	            }if (a == 2) {
	            	return true;
	            }
	            else if (number != a) {
	                return false;
	            }
	        }
	    }
	    return true; 
	} 
      
    //7. If the cards can be ordered without skipping ex. A,2,3,4,5 or 8,9,10,J,Q
	public boolean isStraight(ArrayList<Card> hand) {
	   	int number = 4;
	   	for(Card singleCard : hand){
	   		int tempNum = singleCard.getRank();
	   		if(number == 4) {
	   			number = tempNum; 
	   			}else if (number != tempNum) {
	   				return false;
	   				}
	   		}
	   	return true;
	  		}
   
	// 8. If the cards can be a straight and the suites are the same
    public boolean isStraightSameSuite(ArrayList<Card> hand) {
    	int number = 0;
    	int suite = -1; 
    	for(Card singleCard : hand){
    		int tempNum = singleCard.getRank();
    		int tempSuite = singleCard.getSuit();
    		if(number == 0 && suite == -1) {
    			number = tempNum; 
    			suite = tempSuite;
    			}else if (number != tempNum && suite != tempSuite) {
    				return false;
    				}
    		}
    	return true;
   		}
    
    //9. The rare case of A,J,Q,K,10 of same suite
    public boolean isRare(ArrayList<Card> hand) {
    	
    	int count = 0;
        for(Card singleCard : hand){
        for(Card singleCard1 : hand) {
        for(Card singleCard2 : hand) {
        for(Card singleCard3 : hand) {
        for(Card singleCard4 : hand) {
        int a = singleCard.getRank();
        int b = singleCard1.getRank();
        int c = singleCard2.getRank();                			
        int d = singleCard3.getRank();
        int e = singleCard4.getRank();
        int [] PokerCard = {};
                			
                			
	    if(a == 0 && b == 1 && c == 2 && d == 3 && e == 4) {
	          for (int i =0; i < PokerCard.length; i++) {
        		  for( int j = i+1; j < PokerCard.length; j++) {
        			  if (PokerCard[i] > PokerCard[j]) {
        						int temp = PokerCard[i];
        						PokerCard[i] = PokerCard[j];
        						PokerCard[j] = temp;
        					}
        				}
        			}
	            	count ++;
	             
	                }if (count == 5) {
	                	return true;
	                }else if(a != 0 && b != 1 && c != 2 && d != 3 && e != 4) {
	            			return false;
	            		}
	           }
	         }
	       }
         }
        }
        return true;
    }
   
}
