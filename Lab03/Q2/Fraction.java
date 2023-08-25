public interface Fraction {
	public int getNumerator();
	public int getDenominator();
	public Fraction add(Fraction b);
	public Fraction add(int b);
	public Fraction subtract(Fraction b);
	public Fraction subtract(int b);
	public String toString();
}
