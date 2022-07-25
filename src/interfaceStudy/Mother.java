package interfaceStudy;

public interface Mother 
{ void mul();

  void div();
  
  default void buy()
  {
	  System.out.println("HI THIS IS MOTHERS BUY METHOD");
  }
  
  static void story()
  {
	  System.out.println("MOTHERS STORY");
  }

}
