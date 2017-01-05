package customException;

public class TestException {

	int age;
	
	void agetest(int a)throws InvalidAgeException
	{
		System.out.println(a);
		if(a<18)
		{
			throw new InvalidAgeException(" age is not is not valid ");
		}
		
		else
		{
			System.out.println(" valid ");
		}
		System.out.println("Custom Exception success");
		
	}
	
	
}
