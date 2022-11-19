import java.util.Scanner;

public class Test1094{
	public static void main(String[] args) {
		int i,n,temp;
		n = new Scanner(System.in).nextInt();
		temp= (int) Math.sqrt(n);
		for(i=2;i<=temp;i++)
			if(n%i==0) {
				System.out.print(0);
				break;
			}
		if(n<2) System.out.print(0);
		else if(i>temp||n==2) System.out.print(1);
	}
}