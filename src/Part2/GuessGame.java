package Part2;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	public void startgame() {
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		Boolean p1isRight = false;
		Boolean p2isRight = false;
		Boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random()* 10);
		System.out.println("Число от 1 до 10 загадано");
		
		while (true) {
			System.out.println("Число для угадывания - " + targetNumber);
			
			System.out.println("Игрок 1 указывает вариант: ");
			p1.guess();
			System.out.println("Игрок 2 указывает вариант: ");
			p2.guess();
			System.out.println("Игрок 3 указывает вариант: ");
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Первый игрок думает что это:" + guessp1);
			guessp2 = p2.number;
			System.out.println("Второй игрок думает что это:" + guessp2);
			guessp3 = p3.number;
			System.out.println("Третий игрок думает что это:" + guessp3);
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}if (guessp2 == targetNumber) {
				p2isRight = true;
			};if (guessp3 == targetNumber) {
				p3isRight = true;
			};
		
			if (p1isRight || p2isRight || p3isRight ) {
				System.out.println("У нас есть победитель!");
				System.out.println("Это player 1? " + p1isRight);
				System.out.println("Это player 2? " + p2isRight);
				System.out.println("Это player 3? " + p3isRight);
				System.out.println("The end!");
				break;
			}else {
				System.out.println("Победителя нет, пробуем ещё раз!");
			};
		}
		
	}
}
