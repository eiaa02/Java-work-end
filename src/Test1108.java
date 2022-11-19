import java.util.Scanner;

public class Test1108{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,a,c1=0,c2=0;
		n=input.nextInt();
		while(n-- != 0){
			a=input.nextInt();
			if(a%2!=0)
				c1+=a*a;
			else c2+=a*a*a;
		}
		System.out.print(c1 + " " + c2);
	}
}