package lab13;

import java.util.Scanner;

public abstract class Player {
	Scanner scnr = new Scanner(System.in);
	// To keep the data private, creating abstract class and the variables are
	// private and the getter // setter method is used
	private String name;
	private Roshambo selection;

	public String getName() { // getter for 'name' variable
		return name;
	}

	public void setName(String name) { // setter for 'name' variable
		this.name = name;
	}

	public Roshambo getSelection() { // calling Roshambo Class for selection
		return selection;
	}

	public void setSelection(Roshambo selection) {
		this.selection = selection;
	}

	public abstract Roshambo generateRoshambo();

}
