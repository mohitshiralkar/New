package interfaceStudy;

public class Son implements Father,Mother {

	public static void main(String[] args)
	{Son s=new Son();
	s.add();
	s.sub();
	s.mul();
	s.div();
	s.buy();
	Father.story();
	Mother.story();
  
	}

	@Override
	public void mul() {
		System.out.println("HI THIS IS MUL METHOD");
	}

	@Override
	public void div() {
		System.out.println("HI THIS IS DIV METHOD");
		
	}

	@Override
	public void add() {
		System.out.println("HI THIS IS ADD METHOD");
		
	}

	@Override
	public void sub() {
		System.out.println("HI THIS IS SUB METHOD");
		
	}
	
	@Override
	public void buy()
	{
		Father.super.buy();
		Mother.super.buy();
		
	}
	
	

}
