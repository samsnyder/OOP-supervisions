package uk.ac.cam.ss2249.sup3;

public class EnemyFactory {
	public Enemy getEnemy(String i){
		if(i.equals("a")) return new Alien();
		else return new Monster();
	}
}
