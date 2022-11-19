import java.util.Scanner;

public class Test1074 {
	public static void main(String[] args) {
		int x,y,z,i,count=0;
		int a[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		if((x%100 != 0 &&x%4==0)||x%400==0) a[1]=29;
		for(i=0;i<y-1;i++)
			count+=a[i];
		System.out.print(count+z);
	}
}
