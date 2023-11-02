package Patterns;
import java.util.Scanner;
public class Xyenta2 {
	public int meth(String s,char[]ch,int a[])
	{
		
		int sum=0;
		for(int x=0;x<s.length();x++)
		{
			for(int y=0;y<ch.length;y++)
			{
				if(s.charAt(x)==ch[y])
				{
					sum=sum+a[y];
				}
			}
		}
		return sum;
	}
		
//		for(int x=0;x<s.length();x++)
//		{
//			if(s.charAt(x)=='A' || s.charAt(x)=='E' || s.charAt(x)=='I' || s.charAt(x)=='L' || s.charAt(x)=='N' || s.charAt(x)=='O' || s.charAt(x)=='R' || s.charAt(x)=='S' || s.charAt(x)=='T' || s.charAt(x)=='U')
//			{
//				sum=sum+1;	
//			}
//			else if(s.charAt(x)=='D' || s.charAt(x)=='G')
//			{
//				sum=sum+2;
//			}
//			else if(s.charAt(x)=='B' || s.charAt(x)=='C' || s.charAt(x)=='M' || s.charAt(x)=='P')
//			{
//				sum=sum+3;
//			}
//			else if(s.charAt(x)=='F' || s.charAt(x)=='H' || s.charAt(x)=='V' || s.charAt(x)=='W'|| s.charAt(x)=='Y')
//			{
//				sum=sum+4;
//			}
//			else if(s.charAt(x)=='J' || s.charAt(x)=='X')
//			{
//				sum=sum+8;
//			}
//			else
//			{
//				sum=sum+10;
//			}	
//		}
//		return sum;	
	
	public static void main(String[] args) 
	{
		Xyenta2 obj=new Xyenta2();
		char ch[]=new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int a[]=new int[] {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
		Scanner s=new Scanner(System.in);
		System.out.print("Player1:");
		String p=s.next();
		p=p.toUpperCase();
		System.out.print("Player2:");
		String p2=s.next();
		p2=p2.toUpperCase();
		int player1=obj.meth(p,ch,a);
		int player2=obj.meth(p2,ch,a);
		if(player1>player2)
		{
			System.out.println("Player1 Wins!");
		}
		else if(player1==player2)
		{
			System.out.println("TIE");
		}
		else {
			System.out.println("Player2 Wins");
		}
	}
}
