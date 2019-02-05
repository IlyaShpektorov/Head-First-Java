package Part1;

public class PhraseGenerator {

	public static void main(String[] args) {
		String phrase = "1";
		
		while (phrase != "умный трус") {
		String wordListOne [] = {
				"красивый","умный","веселый","смешной","удивительный","ласковый"
		};
		String wordListTwo [] = {
			"чудик","пёс","врун","вор","кот","слон","зевака","трус","чайник","принц"	
		}; 
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		
		phrase = wordListOne[rand1]+" "+wordListTwo[rand2];	
				
		System.out.println(phrase);
		};
		
	}

}
