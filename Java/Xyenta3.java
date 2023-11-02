package Patterns;

import java.util.Scanner;
import java.util.*;

public class Xyenta3 {

	public static void main(String[] args) 
	{
		System.out.println("<-----SIMPLE CALCUALATOR ----->");
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		String s1=sc.nextLine();
		String arr[]=s1.split(" ");
		List<Integer>li=new ArrayList<Integer>();
		for(int x=0;x<arr.length;x++)
		{
			int number = Integer.parseInt(arr[x]);
			li.add(number);
		}
		System.out.println("-----------------------------");
		System.out.println("| 1)Addition(+)             |\n"
							+ "| 2)Subtraction(-)          |\n"
							+ "| 3)Multiplication(*)       |\n"
							+ "| 4)Division(/)             |\n"
							+ "| 5)ModulusDivision(%)      |\n"
							+ "| 6)Binary(|)               |"
							);
		System.out.println("-----------------------------");
		System.out.println("Select the Operation");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			 result = li.get(0);
	    	  for(int x=1;x<li.size();x++)
	    	  {
	    		  result=result-li.get(x);
	    	  }
	    	  System.out.println(result);
	    break;
		case 2 :
			 for(int x=0;x<li.size();x++)
	    	  {
	    		  result=result+li.get(x);
	    	  }
			 System.out.println(result);
		break;
		case 3:
			result=li.get(0);
			 for(int x=1;x<li.size();x++)
	    	  {
				 if (li.get(x) != 0)
	                {
	                    result = result / li.get(x);
	                } 
	                else
	                {
	                    throw new ArithmeticException("Division by zero is not allowed.");
	                }
	    	  }
			 System.out.println(result);
		break;
		case 4:
			result=li.get(0);
			 for(int x=1;x<li.size();x++)
	    	  {
				 if (li.get(x) != 0)
	                {
	                    result = result * li.get(x);
	                } 
	                else
	                {
	                    throw new ArithmeticException("Division by zero is not allowed.");
	                }
	    	  }
			 System.out.println(result);
		break;
		case 5:
			result=li.get(0);
			 for(int x=1;x<li.size();x++)
	    	  {
				 if (li.get(x) != 0)
	                {
	                    result = result | li.get(x);
	                } 
	                else
	                {
	                    throw new ArithmeticException("Division by zero is not allowed.");
	                }
	    	  }
			 System.out.println(result);
		break;
		case 6:
			result=li.get(0);
			 for(int x=1;x<li.size();x++)
	    	  {
				 if (li.get(x) != 0)
	                {
	                    result = result % li.get(x);
	                } 
	                else
	                {
	                    throw new ArithmeticException("Division by zero is not allowed.");
	                }
	    	  }
			 System.out.println(result);
		break;
		default:System.out.println("Invalid Operation");
		
		}
	}
}
