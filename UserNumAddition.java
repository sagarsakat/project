package Day5Assignment;
import java.util.Scanner;

public class UserNumAddition {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		String d;
		do {
	    System.out.println("::::Add Two Numbers::::");
        System.out.print("Enter First Number: ");
        a=s.nextInt();
        System.out.print("Enter First Number: ");
        b=s.nextInt();
        int c=a+b;
        System.out.println("Addition Of The Two Numbers is:"+c);
        System.out.println("");
        System.out.println("You want perform addition again then write YES and to exit write NO");
        d=s.next();
		}while(d.equalsIgnoreCase("yes"));
		System.out.println("===Program Terminated===");
        
        s.close();
	}

}
