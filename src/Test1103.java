public class Test1103{
	public static void main(String[] args) {
		int i;
		double a,b;
		for(i=1000;i<10000;i++)
		{
			a=i/100;
			b=i%100;
			if(Math.pow(a+b,2)==i) System.out.print(i + " ");
		}
	}
}