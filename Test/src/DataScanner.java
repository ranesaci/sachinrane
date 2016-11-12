import java.util.Scanner;


public class DataScanner {
	public static int getInt(){
		//System.out.println("Enter the Integer:");
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Integer:");
		return scanner.nextInt();*/
		
		Scanner sc=new Scanner(System.in);  
	     
		   System.out.println("Enter Integer:");  
		  int i= sc.nextInt();
		  return i;
	}
	
	public static String getString(){
		System.out.println("Enter the String:");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}


}
