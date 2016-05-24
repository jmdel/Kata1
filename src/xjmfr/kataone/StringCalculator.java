package xjmfr.kataone;
import java.util.StringTokenizer;

public class StringCalculator {
	
	public int add(String str){
		int res = 0;
		str=str.replace('\n', ',');
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while (st.hasMoreElements()){
			res += Integer.parseInt(st.nextToken());
		}
		return res;
	}

}
