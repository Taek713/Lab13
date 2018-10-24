package lab13;

import java.util.HashMap;
import java.util.Scanner;

public class Human extends Player {

	// Generate and return a Roshambo value
	@Override
	public Roshambo generateRoshambo() {

		String selection;

		// Validator parts for setup prompts and error messages
		selection = Validator.getString(scnr, "\nRock, Paper, or Scissors? (R,P,S): ",
				"Please enter \"R\", \"P\", or \"S\". ", "r", "p", "s").toLowerCase();

		HashMap<String, Roshambo> selectionOptions = new HashMap<String, Roshambo>(); // using hashmap to locate what
																						// the selected option was

		selectionOptions.put("R", Roshambo.ROCK);
		selectionOptions.put("P", Roshambo.PAPER);
		selectionOptions.put("S", Roshambo.SCISSORS);

		return selectionOptions.get(selection);
	}

}
