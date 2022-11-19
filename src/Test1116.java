import java.util.Scanner;

public class Test1116{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n,i,j,c;
		n=input.nextInt();
		for(i=1;i<=n;i++){
			c=0;
			for(j=1;j<i;j++)
				if(i%j==0) c+=j;
			if(c==i)
				System.out.print(i + " ");
		}
	}
}