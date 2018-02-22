package prob06;

public class Div {

	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		if (b!=0) return a/b;
		else if (b==0 && a!=0) return b/a;
		return 0;
	}

}
