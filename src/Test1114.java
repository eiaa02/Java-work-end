import java.util.Scanner;

public class Test1114{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num,i=0,c=-1000000;
		while((num=input.nextInt()) != 0){
			i++;
			if(num>c) c=num;
		}
		System.out.print(i + " " + c);
	}
}