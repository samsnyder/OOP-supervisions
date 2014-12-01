package uk.ac.cam.ss2249.sup3;

public class Alien extends Enemy{

	Alien(){
		this.setType("Alien");
	}
	
	@Override
	public String fearMessage() {
		return "Oooooh I am an alien!";
	}

}
