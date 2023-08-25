public class Cal {

	public void compute() {
	    int x = 2, y = 3;
		String s = "hello";
	
		System.out.println("Cal: compute()");
		int n = method1(x, y);
		int m = method2(s);
		System.out.println("method1(" + x + "," + y + ")" + "=" + n);
		System.out.println("method2(" + s + ")" + "=" + m);
	}

	int method1(int x, int y) {
		System.out.println("Cal: method1(" + x + "," + y + ")");
		return x + method3(y);
	}

	int method3(int y) {
		System.out.println("Cal: method3(" + y + ")");
		return 2*y;
	}
	
	int method2(String s) {
		System.out.println("Cal: method2(" + s + ")");
		return s.length()-2;
	}
}
