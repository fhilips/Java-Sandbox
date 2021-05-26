import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int n = 5;
		int array[] = {1,2,3,5};
		
	    Arrays.sort(array);
        int miss = array[0];

        for(int i=0; i < n-2; i++) {
            if(!(array[i] + 1 == array[i+1])){
               miss = array[i]+1;
               System.out.println(miss); 
            }
            
        }
        
        if(array[0] == 2){
        	System.out.println(1); 
        }
        System.out.println(array[n-2]+1);  
       
	}
}
