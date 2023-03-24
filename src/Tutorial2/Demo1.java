package Tutorial2;

public class Demo1 {

	public static void main(String[] args) {
		int a=1002;
		if(a>=1 && a<=100)
		{
			System.out.println("a is small");
		}
		else if(a>=100 && a<=1000)
		{
			System.out.println("a is medium");
		}
		else if(a>=1001 && a<=10000)
		
		{
			System.out.println("a is large");
		}
		else if(a>10001)
		{
			System.out.println("a is biggest");
		}
		else 
		{
			System.out.println("a is zero or negative");
		}
		
	}

}
