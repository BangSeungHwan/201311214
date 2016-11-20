import java.util.Map;
import java.util.HashMap;

class DataStructure5{

	public static void countChar(String str) {

		char[] letters = str.toCharArray();
		Map<String, Integer> wc = new HashMap<String, Integer>();
		
		for(char c:letters){
			String s = Character.toString(c);
			if(wc.containsKey(s)){
				wc.put(s,wc.get(s)+1);
			}else{
			 wc.put(s,1);
			}
		}

		System.out.println(wc);		
	}

	public static void main(String[] args){
		countChar("sangmyung univercity");
	}
}