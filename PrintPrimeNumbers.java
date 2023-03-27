package Day5Assignment;


public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
	    System.out.println("Prime Numbers Between 2 To 20");
		for(int i=2;i<=20;i++)
		{
		  for(int j=2;i<=20;i++)
		  if(i!=j&&i%j!=0)
		  {
			  System.out.print(i);
			  System.out.println();
			  break;
			  
		  }
		}	
    
	}

}
