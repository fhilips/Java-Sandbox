import java.util.Arrays;

public class testes {
 public static void main(String[] args) {
	int n = 4;
	int arr[] = {1, 2, 3, 4 ,5};
	int count = 0;
	// 1 2 3 5 
	Arrays.sort(arr);
//	for(int i = 0; i < n; i++) {
//		System.out.print(arr[i]);
//	}
//	
	for(int i = 0; i < n-1; i++) {
		for (int l = i+1; l < n; l++)
			for(int j = i+1; j < n; j++) {
				System.out.println(arr[i]);
				System.out.println(arr[j]);
				System.out.println(arr[n-i]);
				System.out.println("----");
				if(arr[i] + arr[j] == arr[n-i]) {
					count++;
					System.out.println("count");
				}
			}
	}
	
	System.out.println(count);
}
}