package �쳣;

import java.io.EOFException;

public class Test {
	
	
	void test() throws EOFException
	{
		
		testThrowException(true);
	}
	
	void testThrowException(boolean flag) throws EOFException
	{
		
		if(flag)
		{
			throw new EOFException();
		}
		System.out.println("it is test");
		
		
	}
	
}
