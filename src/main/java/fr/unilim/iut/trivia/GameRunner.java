package fr.unilim.iut.trivia;

import java.util.Random;

public class GameRunner {

	private static boolean notAWinner;

	public static void play(Random rand) {

		Game aGame = new Game();

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		do {

			aGame.roll(rand.nextInt(5) + 1);

			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}

		} while (notAWinner);

	}
}
