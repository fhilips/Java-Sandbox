import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findPermutation {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		String s = "ABC";
		String[] sl = s.split("");
		String sav = "";
		
		for(int i = s.length()-1; i > 0 ; i--) {
			for(int j = 0; j < s.length(); j++) {
				
				sav = sl[i];
				sl[i] = sl[i-j];
				sl[i-j] = sav; 

				for(String q : sl) {
					System.out.print(q);
				}
				sl = s.split("");
				System.out.println(" j= " + j + " i= " + i);
				System.out.println();
			}
		}
	}
}
