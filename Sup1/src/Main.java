
public class Main {
	public static void main(String[] args){
		// Primitives
		int x = 5;
		
		// References
		Integer y;
		
		// Objects
		Table myTable = new Table(10, 15);
	}
	
	// Classes
	static class Table {
		int mWidth;
		int mHeight;
		
		Table(int width, int height){
			mWidth = width;
			mHeight = height;
		}
		
		void printSizes(){
			System.out.println(mWidth + "x" + mHeight);
		}
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
	
	static int sum(int[] a){
		int s = 0;
		for(int i=0; i<a.length; i++)
			s += a[i];
		return s;
	}
	
	static int[] cumsum(int[] a){
		int[] cs = new int[a.length];
		cs[0] = a[0];
		for(int i=1; i<a.length; i++)
			cs[i] = cs[i-1] + a[i];
		return cs;
	}
	
	// Very dirty! Cannot figure out a better way to do this. Normally I would use an ArrayList.
	static int[] positives(int[] a){
		int c=0;
		for(int i=0; i<a.length; i++)
			if(a[i] >= 0)
				c++;
		int[] p = new int[c];
		int j = 0;
		for(int i=0; i<a.length; i++){
			if(a[i] >= 0){
				p[j] = a[i];
				j++;
			}
		}
		return p;
	}
	
}
