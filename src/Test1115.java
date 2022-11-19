import java.util.Scanner;

public class Test1115{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,i,j,c=0;
		n=input.nextInt();
		for(i=2;i<=n;i++){
			for(j=2;j<i;j++)
				if(i%j==0) break;
			if(j==i) {
				c++;
				System.out.print(i + " ");
			}
		}
		System.out.println(c);
	}
}