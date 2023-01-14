import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=0,n2=1,count=0,n;
		
		// System.out.println(n1 + " " + n2);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Value");
		n = sc.nextInt();
		
		System.out.println("Fibonacci Series");
		
		while(count<=n)
		{
			System.out.println(count + " ");
			n1= n2;
			n2=count;
			count=n1+n2;
		}
	

	}

}
