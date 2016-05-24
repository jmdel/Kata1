package xjmfr.kataone;
import java.util.StringTokenizer;

public class StringCalculator {
	
	public int add(String str){
		int res = 0;
		char separator=',';
		if(str.startsWith("//")){
			separator=str.charAt(2);
			str=str.substring(3);
		}
		
		
		
		str=str.replace('\n', separator);
		
		
		StringTokenizer st = new StringTokenizer(str, String.valueOf(separator));
		
		while (st.hasMoreElements()){
			res += Integer.parseInt(st.nextToken());
		}
		return res;
	}

}
