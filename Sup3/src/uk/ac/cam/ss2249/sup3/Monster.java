package uk.ac.cam.ss2249.sup3;

public class Monster extends Enemy {

	Monster(){
		this.setType("Monster");
	}
	
	@Override
	public String fearMessage() {
		return "Rawwrrr I am a monster!";
	}

}
