package reversearray;

import java.util.ArrayList;
import java.util.Arrays;

public class GetReverseArray {
	public static void main(String[] args) 
	{
	      String [] alpha={"A","B","C","D","E","F","G","H","I","J","k","L","M","N","O","P","Q","R","S","T",
	    		  "U","V","W","X","Y","Z"};
	      ArrayList<String> reverse=new ArrayList<String>();;
	      System.out.println("Orignal Array is:"+Arrays.toString(alpha));
	       
	      for(int i=alpha.length-1;i>=0;i--)
	      {
	    	 reverse.add(alpha[i]);
	    	 
	      }
	      
	      Object[] arry=reverse.toArray();
	      String[] arry1=Arrays.copyOf(arry,arry.length,String[].class);
	    
	      System.out.println("Reverse array is:"+Arrays.toString(arry1));
	}

}
