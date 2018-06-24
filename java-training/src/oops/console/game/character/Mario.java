package oops.console.game.character;

public class Mario {
	private String nameOfcharactor;

	public Mario(String nameOfcharactor) {
		this.nameOfcharactor = nameOfcharactor;
		this.nameOfcharactor = (nameOfcharactor);
	}
	
	public void jump() {
		System.out.println(nameOfcharactor + " is jumping");
	}

	public void run() {
		System.out.println(nameOfcharactor + "is runing");
	}

	public void eat() {
		System.out.println(nameOfcharactor + "is eating");
	}

	public void walk() {
		System.out.println(nameOfcharactor + "is walking");
	}

	public static void main(String arg[]) {

	}

}
