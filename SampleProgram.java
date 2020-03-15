import java.util.LinkedHashMap;
import java.util.Map;

public class SampleProgram {

		//with using third variable
//		int a=20;
//		int b=10;
//		int c=0;
//		System.out.println(a);
//		System.out.println(b);
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("after swapping"+a);
//		System.out.println("after swapping"+b);
		
		
//		//without using third variable
//		int a=10;
//		int b=20;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
		
		//factorial
//		int a=5;
//	 int fact=1;
//		for(int i=1;i<=5;i++)
//		{
//			fact=fact*i;
//			
//		}
//		System.out.println(fact);
		
		//fibonacci series
//		int a=0;
//		int b=1;
//		int c=0;
//		for(int i=0;i<=10;i++)
//		{
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		//armstrong number
//		int i=0,j=0;
//		int n=0;
//		 int a=100;
//		 a=n;
//		while(a>0)
//		{
//			i=a%10;
//			j=j+(i*i*i);
//			a=a/10;
//		}
//		if(n==j) {
//			
//	System.out.println("armstrong number");
//	}
//		else {
//			System.out.println("not armstrong number");
//		}
		
//		//armstrong number
//		
//		int n=376;
//		int temp=n;
//		int r,sum=0;
//		
//		while(n>0)
//		{
//			r=n%10;
//		sum=sum+(r*r*r);
//			n=n/10;
//		}
//		
//		if(temp==sum)
//		{
//			System.out.println("armstrong number");
//		}
//		
//		else {
//			System.out.println("not a armstrong number");
//		}
		
		//palindrome number
//		int n=134;
//		
//		int temp=n;
//		int r1,s=0;
//		while(n>0)
//		{
//			r1=n%10;
//			s=s*10+r1;
//			n=n/10;
//		}
//		if(temp==s)
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
		
//		//string reverse
//		String s="welcome";
//		String reverse="";
//		for(int i=s.length()-1;i>=0;i--)
//			
//		{
//			char c = s.charAt(i);
//			reverse=reverse+c;
//			
//		}
//		System.out.println(reverse);
//		
//		//word count
//		String s="welcome to java class";
//		String[] s1 = s.split("");
//		int length = s1.length;
//		System.out.println(length);
//		
		//character count
	public static void main(String[] args) {
		
//	
//		String s1="welcome to java class";
//		char[] c = s1.toCharArray();
//		Map<Character, Integer>mp=new LinkedHashMap<>();
//		for (char d : c) 
//		{
//			
//			if(mp.containsKey(d))
//			{
//				Integer i=mp.get(d);
//				mp.put(d, d+1);
//			}
//			else
//			{
//				mp.put(d, 1);
//			}
//		}
//		System.out.println(mp);
//		
//		
		
//		//patern
//		for(int i=5;i>0;i--)
//		{
//			for(int j=0;j<i;j++)
//			{
//				System.out.print(i);
//				
//			}
//			System.out.println();
		//}
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//		
//		System.out.println();
//		}
//		for(int i=6;i>0;i--)
//		{
//			for(int j=1;j<i;j++)
//			{
//				System.out.print(i);
//			}
//		
//			System.out.println();
//		}
//		for(int i=5;i>0;i--)
//		{
//			for(int j=0;j<i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
}
