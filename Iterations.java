package com.qa.demo;

public class Iterations {

	public static void main(String[] args) {
		forLoop();
	}

	// WHILE LOOP
	public static void catPrinter() {
		int catCount = 5;
		boolean notEnoughCats = true;

		while (notEnoughCats) {
			System.out.println(catCount + ": Another cat");
			catCount++;
			if (catCount == 50) {
				notEnoughCats = false;
			}
		}
		System.out.println("Too many cats what do I do");
	}

	// DO WHILE
	public static void doWhile() {

		int playCount = 0;
		boolean playing = true;

		do {
			System.out.println(playCount + ": Playing");
			playCount++;

			if (playCount == 7) {
				playing = false;
			}
		} while (playing);

		System.out.println("Game over!");
	}

	// FOR LOOPS
	public static void forLoop() {
		for (int i = 0; i <= 10000; i++)
			System.out.println(i);
	}
}
