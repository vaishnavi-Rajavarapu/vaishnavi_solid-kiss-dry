package EPAMCalculator;

public class operation
{
	public void operationperform(int ch,double a,double b)
	{
		if(ch==1)
			System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		else if(ch==2)
			System.out.println("substraction of "+a+" and "+b+" is "+(a-b));
		else if(ch==3)
			System.out.println("multiplication of "+a+" and "+b+" is "+(a*b));
		else 
			System.out.println("division of "+a+" and "+b+" is "+(a/b));
			}
	
}