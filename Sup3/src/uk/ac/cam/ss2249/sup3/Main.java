package uk.ac.cam.ss2249.sup3;

import java.util.Collections;

public class Main {
	public static void main(String[] args){
		CollectionArrayList<Car> t =new CollectionArrayList<Car>();
		t.add(new Car("bmw", 2013));
		t.add(new Car("mercedes", 2014));
		t.add(new Car("bmw", 2010));
		t.add(new Car("renault", 2012));
		Collections.sort(t);
		
		EnemyFactory f = new EnemyFactory();
		System.out.println(f.getEnemy("a"));
		System.out.println(f.getEnemy("m"));
	}
}
