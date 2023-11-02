package Patterns;

import java.util.Scanner;

public class Xyenta 
{
	public void LeftTriangle(int n,String s) 
	{
		if(s.equalsIgnoreCase("left")) 
		{
		for(int x=1;x<=n;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print("#");
			}
			System.out.println(" ");
		}
		}
		else 
		{
			for(int x1=1;x1<=n;x1++)
			{
				for(int y1=n;y1>x1;y1--)
				{
					System.out.print(" ");
					
				}
				for(int z=1;z<=x1;z++)
				{
					System.out.print("#");
				}
				System.out.println(" ");
			}	
		}
	}
	public static void main(String[] args) 
	{
		Xyenta obj=new Xyenta();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter height");
		int n=s.nextInt();
		System.out.println("Alignment");
		String s1=s.next();
		obj.LeftTriangle(n,s1);

	}
}
