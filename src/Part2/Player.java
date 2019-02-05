package Part2;

import java.util.Scanner;

public class Player {
	
	int number;
	
  public void guess(){
	 @SuppressWarnings("resource")
	Scanner s1 = new Scanner (System.in);

	 number = s1.nextInt();
	 System.out.println("Думаю это число: " + number);
 }
}
