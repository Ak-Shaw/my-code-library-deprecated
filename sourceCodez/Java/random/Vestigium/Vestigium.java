import java.util.*;

class Vestigium{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		String[] res=new String[t];

		for(int i=0; i<t; i++){

			int n=sc.nextInt();

			int[][] a=new int[n][n];

			for(int j=0; j<n; j++){
				for(int k=0; k<n; k++){
					a[j][k]=sc.nextInt();
				}
			}

			res[i]=getResult(a, n, i);
		}

		for(int i=0; i<t; i++){
			System.out.println(res[i]);
		}
	}

	private static String getResult(int[][] a, int n, int j){

		int trace=0;

		int row=0;

		int column=0;

		for(int i=0; i<n; i++){

			trace+=a[i][i];

			row+=frequencyNumber(a[i], n);

			int[] b=new int[n];

			for(int k=0; k<n; k++)
				b[k]=a[k][i];

			column+=frequencyNumber(b, n);

		}

		return "Case #"+(j+1)+": "+trace+" "+row+" "+column;


	}

	static int frequencyNumber(int arr[], int size) 
    { 
        // Creating a HashMap containing integer 
        // as a key and occurrences as a value 
        HashMap<Integer, Integer> freqMap 
            = new HashMap<Integer, Integer>(); 
  
        for (int i=0;i<size;i++) { 
            if (freqMap.containsKey(arr[i])) { 
  
                // If number is present in freqMap, 
                // incrementing it's count by 1 
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1); 
            } 
            else { 
  
                // If integer is not present in freqMap, 
                // putting this integer to freqMap with 1 as it's value 
                freqMap.put(arr[i], 1); 
            } 
        } 
  
        // Printing the freqMap 
        for (Map.Entry entry : freqMap.entrySet()) { 
            if((int)(entry.getValue())>1)
            	return 1;
        } 

        return 0;
    } 
}