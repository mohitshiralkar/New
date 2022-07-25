package ControlStatements;

public class NestedIfElseStudy {

	public static void main(String[] args)
	{  String UN= "MOHIT";
	   String PWD= "Mohit@123";
	   
	   if(UN=="MOHIT")
	   {
		   System.out.println("Enter password");
		   
		   if(PWD=="Mohit@123")
		   {
			   System.out.println("Login success");
		   }
		   
		   else
		   {
			   System.out.println("Plz enter correct password");
		   }
	   }
	   else
	   {
		   System.out.println("Plz enter correct username");
		   
	   }
		

	}

}
