import java.util.Scanner;

public class Test1097{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,i,a;
		n = input.nextInt();
		for(i=0;i<n;i++)
		{
			a = input.nextInt();
			if(a>=60)
				System.out.print("Pass");
			else
				System.out.print("Fail");
			System.out.println();
		}
	}
}