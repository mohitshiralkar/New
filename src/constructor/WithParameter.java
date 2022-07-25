package constructor;

public class WithParameter {
	int a;
	int b;
	
	public WithParameter()
	{ a=500;
	  b=300;
	}
	public WithParameter(int x)
	{
	  a=x;
	}
	public WithParameter(int x,int y)
	{
	  a=x;
	  b=y;
	}
	
		public static void main(String[] args) {
	
		WithParameter w=new WithParameter();
		w.add();
		WithParameter w1=new WithParameter(50);
		w1.add();
		WithParameter w2=new WithParameter(80, 20);
		w2.add();
}
	

     public void add()
     {
    	int add=a+b;
    	System.out.println("Addition is "+add);
     }
    	 
     
}





