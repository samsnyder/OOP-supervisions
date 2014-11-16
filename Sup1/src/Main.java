
public class Main {
	public static void main(String[] args){
		
	}
	
	static void addVector(){
		int a=0;
		int b=2;
		int[] values = vectorAdd(a,b,1,1);
		a = values[0];
		b = values[1];
		System.out.println(a+" "+b);
	}
	
	static int[] vectorAdd(int x, int y, int dx, int dy){
		return new int[]{x+dx, y+dy};
	}
	
	static float[][] nmatrix(int n){
		return new float[n][n];
	}
	
}
