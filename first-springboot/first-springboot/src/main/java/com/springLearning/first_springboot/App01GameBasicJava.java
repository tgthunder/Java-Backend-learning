package com.springLearning.first_springboot;

import com.springLearning.first_springboot.game.GameRunner;
import com.springLearning.first_springboot.game.MarioGame;
import com.springLearning.first_springboot.game.PacMan;
import com.springLearning.first_springboot.game.SuperContra;

public class App01GameBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContra();  
		var game = new PacMan();  // 1. Object Creation
		var gameRunner = new GameRunner(game); // 2. object creation + wiring of object
		// Adding dependency to GameRunner Class Meaning that GameRunner class needs a 
		// Game to run 
		gameRunner.run();
	}

}
