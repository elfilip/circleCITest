package org.elfilip;

public class Factorial
{ 

	public static void main(String [] args)
	{
		Factorial f= new Factorial();
		System.out.println(f.getFactorial(5));
	}
	
	
	public Long getFactorial(int n){
        if( n == 0){
            return 1L;
        }
        return n * getFactorial(n-1);
	}

}
