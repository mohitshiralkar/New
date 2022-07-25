package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	{
	  int a[][]=new int[2][2];
	  a[0][0]=10;
	  a[0][1]=15;
	  a[1][0]=20;
	  a[1][1]=45;
	  
		for(int i=0;i<=a.length-1;i++)
		{  for(int j=0;j<=a.length-1;j++)
			{
			System.out.print(a[i][j]+" ");
			}
		
		System.out.println();
		}
	}

}
