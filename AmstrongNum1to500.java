package Day5Assignment;

public class AmstrongNum1to500 {

	public static void main(String[] args) {
		
		int rem=0,add=0;
		System.out.println("Armstrong Numbers From 1 to 500");
		for(int i=1;i<=500;i++)
		{
			int j=i;
			add=0;
			while(j>0)
			{
				rem=j%10;
				j=j/10;
				add=add+(rem*rem*rem);
			}
			if(i>1 && add==i)
			{
				System.out.println("  "+add);			}
		    }

	   }

}
