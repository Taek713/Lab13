package lab13;

import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {

		// scanner entry to start app and get user Entry
		Scanner entry = new Scanner(System.in);
		String keepGoing = "y";
		String playerSelected;
		String opposition;
		Roshambo userSelection;
		Roshambo oppositionSelection = null;

		// assign 0 for win and 1 for lose
		int[] record = new int[2];

		// creating objects
		Human hum = new Human();
		TheFake fake = new TheFake();
		TheReal real = new TheReal();

		// user prompts
		System.out.println("Welcome to Rock Paper Scissors!");

		hum.setName(Validator.getString(entry, "\nEnter your name: "));

		playerSelected = Validator.getString(entry, "\nWould you like to play against TheReal or TheFake?: ",
				"Sorry, entry must be \"r\" or \"f\". ", "r", "f");

		// while loop to continue playing
		while (keepGoing.equalsIgnoreCase("y")) {

			//System.out.println(user.getName() + ": " + selectionOptions.get(selection));
			userSelection = hum.generateRoshambo();
			System.out.println("\n" + hum.getName() + ": " + oppositionSelection);

			// picking with opponent to play against
			if (playerSelected.equalsIgnoreCase("r")) {
				opposition = "TheReal";
				oppositionSelection = fake.generateRoshambo();
				System.out.println(opposition + ": " + oppositionSelection);
			} else {
				opposition = "TheFake";
				oppositionSelection = real.generateRoshambo();
				System.out.println(opposition + ": " + oppositionSelection);
			}

			result(userSelection, oppositionSelection, hum.getName(), opposition, record);//getting, selection, opp selection, human name, opp, and record.

			// while loop to continue playing
			keepGoing = Validator.getString(entry, "\nPlay again? (y/n): ", "Sorry, entry must be \"y\" or \"n\". ",
					"y", "n");
		}
		System.out.println("Wins: " + record[0] + "\nLosses: " + record[1]);
		System.out.println("\nThank you for playing Rock Paper Scissors!");
	}

	// method to determine the result of match and print output
	public static void result(Roshambo userSelection, Roshambo oppositionSelection, String user, String opposition,
			int[] record) {

		if (userSelection != oppositionSelection) {
			if (userSelection == Roshambo.ROCK) {
				if (oppositionSelection == Roshambo.PAPER) {
					System.out.println(opposition + " wins!");
					record[1]++;

				} else {
					System.out.println(user + " wins!");
					record[0]++;
				}
			} else if (userSelection == Roshambo.PAPER) {
				if (oppositionSelection == Roshambo.ROCK) {
					System.out.println(user + " wins!");
					record[0]++;
				} else {
					System.out.println(opposition + " wins!");
					record[1]++;
				}
			} else if (userSelection == Roshambo.SCISSORS) {
				if (oppositionSelection == Roshambo.ROCK) {
					System.out.println(opposition + " wins!");
					record[1]++;
				} else {
					System.out.println(user + " wins!");
					record[0]++;
				}
			}
		} else {
			System.out.println("Draw!");
		}

	}
}
