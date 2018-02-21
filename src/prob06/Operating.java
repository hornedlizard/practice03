package prob06;

public abstract class Operating {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
}
