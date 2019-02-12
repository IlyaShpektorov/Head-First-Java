package Part3;

public class Massive {

	public static void main(String[] args) {
		 dog[] pets;
		 pets = new dog[7];
		 
		 pets[0] = new dog();
		 pets[1] = new dog();
		 pets[3] =  pets[1];
		 pets[1].name = "Miko";
		 pets[3].bark();

	}

}
