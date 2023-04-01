
public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int[] a= {1,2,9};
		      int i=1;
		      int j=0;
		      int c=0;
		     do
		      {
		    	  if(i==a[j]);
		    	  {
		    	      i++;
		    		  j++;
		    	  }
		    	 
		    		  while(i<a[j])
		    		  {
		    			  c++;
		    			  System.out.println(i);
		    			  i++;
		    			 
		    		  }   
		      }while(j<a.length-1);
		     if(c==0)
		     {
		    	 System.out.println("no missing");
		     }
			}
          
		
	}


