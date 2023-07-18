package com.Digit.Project.KBC;

import java.util.Scanner;

class KBCMain extends QuestionList {

	void welcome() {

		System.out.println(
				"Type \033[1m  Y \033[0m to continue\n"
				+ "      \033[1m N \033[0m to quit\n"
				+ "      \033[1m I \033[0m to get all the Information\n"
				+ "      \033[1m A \033[0m to get all the Prize list");

		s1 = sc.next();
		if (s1.equalsIgnoreCase("y")) {
			System.out.println("Let's begin \033[1m The Game of Money\033[0m\n");
			playgame();
		} else if (s1.equalsIgnoreCase("n")) {
			System.out.println("Thank You 🌹...");
		} else if (s1.equalsIgnoreCase("i")) {
			information();
		} else if (s1.equalsIgnoreCase("a")) {
			amounts();
			System.out.println(" \n");
			welcome();
		} else {
			welcome();
		}

	}
void startgame() {
	s1 = sc.next();
	if (s1.equalsIgnoreCase("y")) {
		System.out.println("Continue");
		playgame();
	}
	else {
		System.out.println("enter a valid option");
		startgame();
	}
}
void alloption() {
	if (s1.equalsIgnoreCase("y")) {
		System.out.println("Let's begin \033[1m The Game of Money\033[0m");
		playgame();
	} else if (s1.equalsIgnoreCase("n")) {
		System.out.println("Thank You 🌹...");
	} else if (s1.equalsIgnoreCase("i")) {
		information();
	} else if (s1.equalsIgnoreCase("a")) {
		amounts();
		System.out.println(" \n");
		welcome();
	} else {
		welcome();
	}

}
	void information() {
		System.out.println(
				"\033[1mAll the information is given below--\n" + "There are 10 Question which you have to answer.\n"
						+ "The total winning amount is 25000000\n" + "You will get two life line\033[0m");

		System.out.println("Type Y to continue");
		s1 = sc.next();
		if (s1.equalsIgnoreCase("y")) {
			System.out.println("Continue");
			playgame();
		}
		else {
			alloption();
		}
	}

	void user() {
		System.out.println("\t\t\033[1m------WELCOME------\033[0m");
		System.out.println("\t\t\u001B[31m\033[1m-------स्वागतम--------\033[0m");

		System.out.println("\033[1mनमस्कार\033[0m \nPlease Enter your name to continue: ");
		name = sc.nextLine();

		System.out.println("Welcome \033[1m" + name + "\033[0m to Kon Banega Crorepati");

	}

}

class KBC {
	public static void main(String[] args) {
		KBCMain kb = new KBCMain();
		kb.user();
		kb.welcome();

	}
}