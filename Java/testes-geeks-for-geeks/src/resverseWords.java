
public class resverseWords {

	public static void main(String[] args) {
		
		String s = "i.like.this.program.very.much";

	    String[] cp = s.split("\\.");
	    String l = "";
	  
	    for(int i = cp.length-1; i >= 0; i--) {
	    	if(i==0) {
	    		l += cp[i];
	    		break;
	    	}
	    	l += cp[i] + ".";
	        
	    }
	   
	    System.out.println(cp.length);
	    System.out.println(l);
	    
	}
}
