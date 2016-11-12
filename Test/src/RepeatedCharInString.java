
public class RepeatedCharInString {
	static String str = "sachinsachinsachin";
	static char[] sbf = new char[str.length()-1];
	
	
	static{
		System.out.println(str);
		sbf=str.toCharArray();
		
		
	}
	
	static StringBuffer sb = new  StringBuffer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;int count=0;
		while (i<str.length()) {
			char ch = str.charAt(i);
			//System.out.println(ch+" >>"+swap(ch));
			
			/*if(swap(ch)==false){
				count++;
			}
			if(count==2){
				System.out.println(count +" repeated char "+ch);
			}
			//swap(ch);
*/		
			int num =CheckinBfr(ch);
			System.out.println(ch+" repeated times: "+num);
			i++;
			
		}

	}
	private static int CheckinBfr(char ch) {
		int i =0;
		int count=0;
		while(i<sbf.length){
			if(ch==sbf[i]){
				count++;
			}
			i++;
		}
		return count-1;
	}
	private static boolean swap(char ch) {
		// TODO Auto-generated method stub
		int i=0;boolean flag =false;
		while(i<sb.length()){
			//System.out.println(sb.toString());
			if(ch==sb.charAt(i)){
				flag=true;
				break;
			}
			
			
			i++;
			
		}
		if(flag==false){
			sb.append(ch);
			return true;
		}else return false;
		
		
	}

}
