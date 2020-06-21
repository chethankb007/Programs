import java.util.Scanner;

/* A ComplexNumber class contains two data members : 
 	one is the real part (R) and the other is imaginary (I) (both integers).
	Implement the Complex numbers class that contains following functions -
	constructor
	plus
	multiply
	print -is function prints the given complex number in the following format : a + ib

	Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.
*/
public class ComplexNumber {
	
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void plus(ComplexNumber c2)
	{
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
	
	public void multiply(ComplexNumber c2)
	{
		int newreal = (this.real * c2.real) - (this.imaginary * c2.imaginary);
		int newimaginary = (this.real*c2.imaginary) + (c2.real * this.imaginary);
		this.real = newreal;
		this.imaginary = newimaginary;
	}
	
	public void print()
	{
		System.out.println(this.real +  " + i"+this.imaginary);
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
		ComplexNumber c2 = new ComplexNumber(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		
		else {
			return;
		}
		s.close();
		
	}

}
