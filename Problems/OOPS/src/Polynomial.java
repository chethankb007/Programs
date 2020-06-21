import java.util.Scanner;

/*
	Implement a polynomial class, that contains following functions -
	setCoefficient 
	add
	subtract
	multiply
	print- Prints all the terms
		(only terms with non zero coefficients are to be printed) in increasing order of degree.
*/
public class Polynomial {
	
	int[] data;
	public Polynomial()
	{
		data = new int[5];
	}
	
	public void setCoefficient(int degree, int coeff) {
		
		if(degree >= this.data.length)
		{
			int[] newarr = new int[degree+1];
			
			for(int i = 0;i<this.data.length;i++) 
			{
				newarr[i] = data[i];
			}
			data = newarr;
				
		}
		data[degree] = coeff;
		
	}
	
	public Polynomial add(Polynomial p2)
	{
		  Polynomial sum = new Polynomial();
		int i = 0;
		int j = 0;
		while(i < this.data.length  && j < p2.data.length) 
		{
			sum.setCoefficient(i,this.data[i] + p2.data[j]);
			i++;
			j++;
		}
		while(i < this.data.length)
		{
			sum.setCoefficient(i,this.data[i]);
			i++;
		}
		while(j < p2.data.length) 
		{
			sum.setCoefficient(j, p2.data[j]);
			j++;
	}
			return sum;
	}
	
	public Polynomial subtract(Polynomial p2) {
		
		  Polynomial diff = new Polynomial();
			int i = 0;
			int j = 0;
			while(i < this.data.length  && j < p2.data.length) 
			{
				diff.setCoefficient(i,this.data[i] - p2.data[j]);
				i++;
				j++;
			}
			while(i < this.data.length)
			{
				diff.setCoefficient(i,this.data[i]);
				i++;
			}
			while(j < p2.data.length) 
			{
				diff.setCoefficient(j, - p2.data[j]);
				j++;
		}
				return diff;
		
	}
	
	private Polynomial multiply(Polynomial p2) {
		
		Polynomial prod = new Polynomial();
		for (int i = 0; i < this.data.length; i++)  
        { 
            // Multiply the current term of first polynomial 
            // with every term of second polynomial. 
            for (int j = 0; j < p2.data.length; j++)  
            { 
                int newDegree = i+j;
                int newValue = this.data[i]*p2.data[j];
                if(newDegree < prod.data.length)
                {
                    int oldValue = prod.data[newDegree];
                    newValue = newValue + oldValue;
                }
                prod.setCoefficient(newDegree,newValue);           
             } 
        } 

		
		
		return prod;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
    public void print(){

        for(int i=0;i<this.data.length;i++){
            if (this.data[i] != 0) { 
                System.out.print(this.data[i] +"x" + i+" "); 
            }


        }
    }
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		s.close();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}

	

	

	}


