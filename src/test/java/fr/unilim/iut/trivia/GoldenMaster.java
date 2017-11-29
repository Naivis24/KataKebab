package fr.unilim.iut.trivia;

import java.util.Random;

public class GoldenMaster {
	
	public String getGameResult(long seed){
		GameRunner.play(new Random(seed));
	}
}
