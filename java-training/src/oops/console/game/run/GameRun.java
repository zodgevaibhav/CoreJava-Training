package oops.console.game.run;

import oops.console.game.character.Mario;

public class GameRun {

	public static void main(String agr[]) {
		Mario mario = new Mario("chetna");
		mario.eat();
		mario.run();
		mario.jump();
		mario.walk();
	}
}
