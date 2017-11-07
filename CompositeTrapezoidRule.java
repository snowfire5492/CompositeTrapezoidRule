 /**
	 * CS 301: Numerical Methods
	 * Professor: A. Khakpour
	 *
	 * Computer Exercise: 5.1: 1 & 2 
	 * CompositeTrapezoidFunction
	 * 
	 *
	 * @author - Eric Schenck
	 * last modified: November 12, 2017
	 *   
	 */
public class CompositeTrapezoidRule {
	public static void main(String[] args){
		
		float twoA, twoB, twoC;	// used to store answers for formatted printing 
		
		// function( char 'a,b, or c' , a, b, n )
		
		twoA = Trapezoid_Uniform('a' , (float)0.0 , (float)3.14 , 10000);
		
		System.out.print("\n\nProblem 2a.) : " + twoA );
		
		
		twoB = Trapezoid_Uniform('b' , (float)0.0 , (float)1.0 , 10000);
		
		System.out.println("Problem 2b.) : " + twoB ); 
		
		twoC = Trapezoid_Uniform('c' , (float)0.0 , (float)1.0 , 10000);
		
		System.out.println("Problem 2c.) : " + twoC );
		
	}
	
	public static float Trapezoid_Uniform(char f, float a, float b, int n){
		
		float h = 0;
		float sum = 0;
		float x = 0;
		
		h = (b-a)/n;			// setting h based on arguments
		
		sum =(float).5 * ( f(f,a) + f(f,b) );
		
		for(int i = 1 ; i < (n-1) ; ++i){
			x = a + (i * h);
			sum += f(f,x);
		}
		
		sum *= h;
		
		return sum;
	
	}
	
	public static float f(char f, float xi){
		float y = 0;
		switch(f){	
			case 'a':			// function for problem 2a
				y = (float)Math.sin(xi);
				break;
			case 'b':			// function for problem 2b
				y = (float)Math.exp(xi);
				break;
			case 'c':			// function for problem 2c
				y = (float)Math.atan(xi);
				break;
			default:
				System.out.println("Incorrect Entry");
				break;
		}
		return y;
	}
	
}
