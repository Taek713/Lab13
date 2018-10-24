package lab13;

public class TheFake extends Player {

	// Generate and return a Roshambo value
	@Override
	public Roshambo generateRoshambo() {

		// Computer thats always returning "ROCK"
		return Roshambo.ROCK;
	}
}
