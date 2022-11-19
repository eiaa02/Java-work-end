import java.util.Scanner;

public class Test1106{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int m,n,c=0,i;
		m = input.nextInt();
		n = input.nextInt();

		for(i=1;i<=n;i++)
			if(n%i==0&&m%i==0)
				c=i;
		System.out.print(c);
	}
}