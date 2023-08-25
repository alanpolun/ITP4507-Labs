public class SimpleFraction implements Fraction {
	int num, denum; // numerator and denumrator of the fraction

	public SimpleFraction (int n, int m) {
		num = n;
		denum = m;
	}

	
	public int getNumerator() {
		return num;
	}

	public int getDenominator() {
		return denum;
	}

	public Fraction add(Fraction b) {
		return new SimpleFraction(num*b.getDenominator()+b.getNumerator()*denum, denum*b.getDenominator());
	}

	public Fraction add(int b) {
		return new SimpleFraction(num+b*denum, denum);
	}

	public Fraction subtract(Fraction b) {
		return new SimpleFraction(num*b.getDenominator()-b.getNumerator()*denum, denum*b.getDenominator());
	}

	public Fraction subtract(int b) {
		return new SimpleFraction(num-b*denum, denum);
	}

	public String toString() {
		return num + "/" + denum;
	}
}