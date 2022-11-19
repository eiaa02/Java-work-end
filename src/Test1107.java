import java.util.Scanner;

public class Test1107{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,i;
		int[] a = new int[10000];
		a[0] = 1;a[1] = 1;

		n = input.nextInt();
		for(i=2;i<=n;i++)
			a[i]=a[i-1]+a[i-2];
		if(a[n]%3 != 0)
			System.out.print("no");
		else
			System.out.print("yes");
	}
}