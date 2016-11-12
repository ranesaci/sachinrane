import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;


public class PyramidPattern extends ScannerTest {
	public IOException m1() throws IOException{
		
		LinkedList ll = new LinkedList<>();
		
		return null;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Integer:");
		int n= scanner.nextInt();*/
		int n = 10;//DataScanner.getInt();
		int i =n;
		/*while(i>0){
			int j=0;
			while(j<n*2){
				if(j>=i && (i+j-1)<n*2 ){
					System.out.print("* ");
					
				}else{
					System.out.print("  ");
				}
				j++;
			}
			System.out.println();
			
			i--;
		}*/
		
		for (int j = 0; j <n; j++) {
			for (int j2 = 0; j2 < n-j; j2++) {
				System.out.print(" ");
				
			}
			for (int j2 = 1; j2 <= j; j2++) {
				System.out.print("*");
				
			}
			for (int j2 = 0; j2 < j-1; j2++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		for (int j = n-1; j >= 1; j--) {
			for (int j2 = 0; j2 < n-j; j2++) {
				System.out.print(" ");
				
			}
			for (int j2 = 1; j2 <= j; j2++) {
				System.out.print("*");
				
			}
			for (int j2 = 0; j2 < j-1; j2++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
		


	}

}
