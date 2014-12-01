package uk.ac.cam.ss2249.sup3;

public abstract class Enemy {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public abstract String fearMessage();

}
