import java.util.Random;


public class ShuffleCards {
	


	
	public enum Suit{
		CLUBS(1), SPADES(2), HEARTS(3),DIAMONDS(4);
		int value;
		private Suit(int v){ value = v;}
	}
		
		public int card;
		private Suit suit;
		
		public ShuffleCards(int r, Suit s){
			card = r;
			suit = s;
		}
		
	
	public Suit suit(){return suit;}
	
	
	
	
	
	
	
	
	
	public void shuffle(int cards[]){
		int temp, index;
		
		for(int i=0; i<cards.length;i++){
			index= (int) (Math.random()*(cards.length-1) + 1);
			temp = cards[i];
			cards[i]=cards[index];
			cards[index] = temp;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	/*public void shuffle(int seed){
		Random r = new Random();
		for(int i =5; i<1; i--){
		int x = r.nextInt(4-1)+1;                // min-max+1 plus minimum
		swap(i, x);
		}
	} */
	
	
	
	public void swap(int a, int b){
		a= a+b;
		b=a-b;
		a=a-b;
	}
}
