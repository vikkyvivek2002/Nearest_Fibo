import java.util.Scanner;

public class Nearest_Fibo
 {

	static boolean fabo(int n ) {
	int sum =0 ;
	int a=0 ,b = 1;
	while(sum < n)
		{
		sum =  a+b;
		a=b;
		b= sum;
		}
	    if(sum == n)
	    	return true;
	    else
	    	return false;
}

	    
	    
	static int Before_fib(int n)
	
	{
	int c =0 ;
	while(true)
	{
		if(fabo(n))
			return c;
		else
		{
			n = n-1;
			c++;
		}
	}
	}
	
static int After_fib(int n)
	
	{
	int c =0 ;
	while(true)
	{
		if(fabo(n))
			return c;
		else
		{
			n = n+1;
			c++;
		}
	}
	}
	
	
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = s.nextInt();
    int m1 = Before_fib(n);
    int m2 = After_fib(n);
    if(m1 > m2)
	{
		System.out.println("Nearest value =  " +(n+m2));
	}
	
	else if(m2 > m1)
	{
		System.out.println("Nearest value  = " +(n-m1));
	}
	else if((n-m1) == (n+m2))
	{
		System.out.println(" fibonacci number is  = " + n);
	}
	else if(m1 == m2)
	{
		System.out.println("Nearest values are  = "  +(n-m2) +", " +(n+m2) );
	}
    }

}
