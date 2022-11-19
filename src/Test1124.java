import java.util.Scanner;

public class Test1124 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x,i,max=0;
		while((x=input.nextInt()) != 0){
			for(i=2;i<x;i++){
				if(x%i==0) break;
			}
			if(i==x&&max<x) max=x;
		}
		if(max != 0) System.out.print(max);
		else System.out.print("no");
	}
}