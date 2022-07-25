package loopStudy;

public class StarPattern1 {

	public static void main(String[] args) 
	{
		{
			for(int a=1;a<=4;a++)
			{
				for(int b=1;b<=a;b++)
				{
					System.out.print("*");
				}
				  System.out.println();
				  System.out.println("=============");
				  
				  for(int i=1;i<=4;i++)
				  {
					  for(int j=4;j>=i;j--)
					  {
						  System.out.print("*");
					  }
					       System.out.println();
				  }
			}
		}
		}
	}

	


