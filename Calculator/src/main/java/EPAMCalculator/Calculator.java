package EPAMCalculator;
import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("select the operation that you want to use\n1)addition\n2)subtraction\n3)multiplication\n4)division\nEnter the option:");
		int ch=sc.nextInt();
		if(ch<5) {
			System.out.println("Enter the first value:");
			double firstval=sc.nextDouble();
			System.out.println("Enter the second value:");
			double secondval=sc.nextDouble();
			operation oper=new operation();
			oper.operationperform(ch,firstval,secondval);
		}
		else
			System.out.println("Invalid option...please choose one of the number given in the display");
		}
		catch(Exception e)
		{
			System.out.println("please enter numbers  only.......");
		}
	}

}