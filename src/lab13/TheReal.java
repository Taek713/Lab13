package lab13;

public class TheReal extends Player {

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.values()[getMathRandomNumGenerator()];// returning floating point
	}

	// Method using Math Class to generate random picks by 3 for r, p, s.
	public static int getMathRandomNumGenerator() {
		return (int) (Math.random() * 3);
	}

}
