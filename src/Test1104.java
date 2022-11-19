import java.util.Scanner;

public class Test1104{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,i;
		double a,b;
		n = input.nextInt();
		for(i=0;i<n;i++){
			a = input.nextDouble();
			if(a<=1000)
				System.out.print(0 + " ");
			else
			if(a<=3000)
				System.out.print(a*0.03 + " ");
			else
			if(a<=5000)
				System.out.print(a*0.04 + " ");
			else
				System.out.print(a*0.06 + " ");
		}
	}
}