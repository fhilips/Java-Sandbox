
public class countTriplet {
	public static void main(String[] args) {
	 int count = 0;
     int n = 6;
     int x = 0;
     int arr[] = {1, 2, 3, 4, 5, 6 };
        

      for(int i = 0; i < n - 1; i++) {
       for(int l = n-1; l > 0 ; l--){
            for(int j = i+1; j < (l); j++) {
            
            System.out.println("i = "+i);
            System.out.println("j = "+j);
          
             System.out.println(arr[i]);
             System.out.println(arr[j]);
             System.out.println(arr[l]);
             System.out.println("-----");
            if(arr[i] + arr[j] == arr[l]) {
                 count++;
                  System.out.println("count = " + count);
            }
            
        }
        }
        
        
         System.out.println("---------------");
        }
               
	        System.out.println("count = " + count);
	    }
	}

