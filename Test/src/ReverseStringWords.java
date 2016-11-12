
public class ReverseStringWords {
	
	static String str = "Sachin Nina Rane";
	static{
		System.out.println("Old >"+str);
	}
	
	static StringBuffer sb = new StringBuffer(str);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int start=0;
		int end;
		
		while(i<sb.length()){
			if(sb.charAt(i)==' ' || i==sb.length()-1){
				if(i==sb.length()-1){
					i++;
				}
				end=i-1;
				swap(start,end);
				start=i+1;
			}
			i++;
		}
		
		System.out.println(sb.toString());
		

	}

	private static void swap(int start, int end) {
		// TODO Auto-generated method stub
		while(start<end){
			char ch = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, ch);
			start++;
			end--;
		}
		
	}

}
