package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		GameCalculator[] gameCalculators = new GameCalculator[] {new WomenGameCalculator(),new ManGameCalculator()};
		
		for(GameCalculator gameCalculator: gameCalculators) {
			gameCalculator.hesapla();
			gameCalculator.oyunBitti();
		}
	}

}
