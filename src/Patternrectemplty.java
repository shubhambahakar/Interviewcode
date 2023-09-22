// print pattern in hollow rectangle some space are vacant
public class Patternrectemplty {
	public static void main(String[] args) 
	{
      int m= 4; int n=8;
      for(int i=1; i<=m; i++)
      {
    	  for(int j=1; j<=n; j++)
    	  {
    		  if(i==1 || j==1 || i==m || j==n)
    		  {
    		  System.out.print("*");  // print in sigle horizontal line 
    	      }
    		  // jar space nahi dila tar correct work mahi karat
    		  else { System.out.print(" "); }

    	  }
    	  
    	       System.out.println(); // this line is impm
      }
	}

}


