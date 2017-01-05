package customException;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	
	TestException obj=new TestException();
	
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter the age");
	int b=sc.nextInt();
	System.out.println(b);
	
		try {
			obj.agetest(b);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	
	
	
	
}
}
