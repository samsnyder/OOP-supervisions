package uk.ac.cam.ss2249.sup3;

public class Car implements Comparable<Car>{
	private String manufacturer;
	private int age;
	
	Car(String m, int a){
		manufacturer = m;
		age = a;
	}

	@Override
	public int compareTo(Car o) {
		int r = this.manufacturer.compareTo(o.manufacturer);
		return r == 0 ? this.age - o.age : r;
	}
	
	@Override
	public String toString(){
		return manufacturer + " (" + age + ")";
	}
}
