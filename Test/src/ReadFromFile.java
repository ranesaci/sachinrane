import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("with filereader");
		BufferedReader bf = new BufferedReader(new FileReader("//home//sachin//workspace//Test//src//file.txt"));
		
		StringBuffer sb=new StringBuffer();;
		StringBuffer sb1=new StringBuffer();;
		String str;
		while(( str=bf.readLine())!=null){
			sb.append(str);
			
		}
		System.out.println(sb.toString());
		
		System.out.println("with scanner");
		
		Scanner scanner = new Scanner(new File("//home//sachin//workspace//Test//src//file.txt"));
		while(scanner.hasNextLine()){
			sb1.append(scanner.next());
		}
		System.out.println(sb1.toString());

	}

}
