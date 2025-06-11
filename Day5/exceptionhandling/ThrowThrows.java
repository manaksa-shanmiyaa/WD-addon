package exceptionhandling;

public class ThrowThrows {
   static void invalidAge() throws AgeInvalid{
   throw new AgeInvalid("not eligible");
   }

public static void main(String[] args) throws AgeInvalid{
	var age = 10;
	if(age<18) {
		invalidAge();
	}
	else {
		System.out.println("allowed");
	}
}


	
	

}
