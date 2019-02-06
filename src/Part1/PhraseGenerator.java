package Part1;

public class PhraseGenerator {

	public static void main(String[] args) {
		
		Boolean phraseComlete = false;
		
		while (true) {
		String phrase = "умный трус";
		
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
		
		String phraseComb = wordListOne[rand1]+" "+wordListTwo[rand2];	
				
		if (phrase.equals (phraseComb))	{
			System.out.println(phraseComb);
			break;
					
		}else {
				System.out.println(phraseComb);
				System.out.println("еще раз!");
		}
		
		}
		
	}

}
