package interfaceStudy;

public interface Father 
{ void add();

  void sub();
  
  default void buy()
  {
	  System.out.println("HI THIS IS FATHERS BUY METHOD");
  }
  
  static void story()
  {
	  System.out.println("FATHERS STORY");
  }
	
}
