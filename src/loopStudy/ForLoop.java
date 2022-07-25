package loopStudy;

public class ForLoop {

	public static void main(String[] args) 
	{
		
		
		{
	       for(int a=1;a<=4;a++)            // rows

	       {
	    	   for(int b=1;b<=a;b++)        // column
	    	   {
	        	   System.out.print("*");      
	    	   }
	    	   
	    	   System.out.println();
	       }

		}
		 System.out.println("==========");

	       
	       
	       for(int a=1;a<=4;a++)            // rows

	       {
	    	   for(int b=4;b>=a;b--)        // column
	    	   {
	        	   System.out.print("*");      
	    	   }
	    	   
	    	   System.out.println();
	       }
		}
	}


