
public class Fraction {
	
	private int numerator;
	private int denominator;
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	private void simplify() {

		int gcd=1;
		int smaller=Math.min(numerator, denominator);
		
		for(int i=2; i<=smaller; i++) {
			if(numerator % i==0 && denominator % i == 0) {
				gcd=i;
			}
		}
		numerator/=gcd;
		denominator/=gcd;
		
	}
	public void print() {
	
		System.out.println(numerator+"/"+denominator);
		
	}
	
	//Increment fraction by 1 -- if u ncrement fraction by 1 denomiator will be added to numerator ex(2/3 + 1= 5/3)
	public void increment() {

		numerator=numerator+denominator;
	}
	public void add(Fraction f2) {
		//First fraction is the fraction on which function is called
		//Second fraction f2 is passed as an argument and it will be added to first fraction
		
		this.numerator=this.numerator*f2.denominator + this.denominator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNumerator=f1.numerator*f2.denominator + f1.denominator*f2.numerator;
		int newDenominator=f1.denominator*f2.denominator;
		
		Fraction f3=new Fraction(newNumerator, newDenominator);

		return f3;
	}
	

	public static void main(String[] args) {
		Fraction f1=new Fraction(4, 6);
		f1.print();
		//f1.increment();
		//f1.print();
		Fraction f2=new Fraction(4, 8);
		f2.print();
		
		//adding two fractions
		
		
		//f1.add(f2); //Method 1: adding second fraction(f2) to first fraction(f1)
		//f1.print();
		
		Fraction f3=Fraction.add(f1,f2); //Method 2 : Adding two fractions f1 and f2 and store it in new Fraction f3
		f3.print();

	}

}
