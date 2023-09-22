// print the pattern rectangle
public class Patternrect {

	public static void main(String[] args) 
	{
      int m= 4; int n=8;
      for(int i=1; i<=m; i++) // row 
      {
    	  for(int j=1; j<=n; j++) // coloum
    	  {
    		  System.out.print("*");  // print in sigle horizontal line 
    	  }
    	       System.out.println();
      }
	}

}
