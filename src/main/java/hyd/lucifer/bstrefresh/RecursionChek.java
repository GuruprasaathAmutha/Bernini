package hyd.lucifer.bstrefresh;

public class RecursionChek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rec(10);
	}
	
	
	static int rec(int i) {
		if(i>=0) {
			System.out.println(i*rec(--i));
			return i;
		}
		return 1;
	
	}

}
