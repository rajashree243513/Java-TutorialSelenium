package Tutorial1;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {

		int abc[] = { 100, 200, 400, 200 };
		//3<4
for (int i = 0; i < abc.length; i++) 
{				
			//4<4
for (int j = i + 1; j < abc.length; j++) 
{
	System.out.println(abc[j]);
		//200  400 200
		//400  200
		//200

	}


}
	}
}
