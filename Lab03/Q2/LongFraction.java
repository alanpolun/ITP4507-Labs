public class LongFraction {
  protected final long numerator_;
  protected final long denominator_;

  /** Return the numerator **/
  public final long numerator() { return numerator_; }

  /** Return the denominator **/
  public final long denominator() { return denominator_; }

  /** Create a LongFraction equal in value to num / den **/
  public LongFraction(long num, long den) {
    // normalize while constructing
    boolean numNonnegative = (num >= 0);
    boolean denNonnegative = (den >= 0);
    long a = numNonnegative? num : -num;
    long b = denNonnegative? den : -den;
    long g = gcd(a, b);
    numerator_ = (numNonnegative == denNonnegative)? (a / g) : (-a / g);
    denominator_ = b / g;
  }

  public String toString() { 
    if (denominator() == 1) 
      return "" + numerator();
    else
      return numerator() + "/" + denominator(); 
  }

  public static long gcd(long a, long b) { 
    long x;
    long y;

    if (a < 0) a = -a;
    if (b < 0) b = -b;

    if (a >= b) { x = a; y = b; }
    else        { x = b; y = a; }

    while (y != 0) {
      long t = x % y;
      x = y;
      y = t;
    }
    return x;
  }

  /** return a LongFraction representing this LongFraction plus b **/
  public LongFraction plus(LongFraction b) {
    long an = numerator();
    long ad = denominator();
    long bn = b.numerator();
    long bd = b.denominator();
    return new LongFraction(an*bd+bn*ad, ad*bd);
  }

  /** return a LongFraction representing this LongFraction plus n **/
  public LongFraction plus(long n) {
    long an = numerator();
    long ad = denominator();
    long bn = n;
    long bd = 1;
    return new LongFraction(an*bd+bn*ad, ad*bd);
  }

  /** return a LongFraction representing this LongFraction minus b **/
  public LongFraction minus(LongFraction b) {
    long an = numerator();
    long ad = denominator();
    long bn = b.numerator();
    long bd = b.denominator();
    return new LongFraction(an*bd-bn*ad, ad*bd);
  }

  /** return a LongFraction representing this LongFraction minus n **/
  public LongFraction minus(long n) {
    long an = numerator();
    long ad = denominator();
    long bn = n;
    long bd = 1;
    return new LongFraction(an*bd-bn*ad, ad*bd);
  }


}
