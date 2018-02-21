package prob06;

public class Div extends Operating {

	@Override
	int calculate() {
		if (b!=0) return a/b;
		else if (b==0 && a!=0) return b/a;
		return 0;
	}

}
