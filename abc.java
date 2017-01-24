import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the second number");
		int b=scan.nextInt();
		if(a>b)
			System.out.println(a+" is bigger");
		else if(b>a)
			System.out.println(b+" is bigger");
		else
			System.out.println("These numbers are equal");	
	}

}