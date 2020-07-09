import java.util.*;

public class MaximumXor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n;
        n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int ans = maximumXor(n,a);
        System.out.println(ans);
        sc.close();
    }
    
    public static int maximumXor(int n,ArrayList<Integer> a){
        
        int maxx = 0, mask = 0; 
  
        HashSet<Integer> se = new HashSet<Integer>(); 

        for (int i = 30; i >= 0; i--)  
        { 

            // set the i'th bit in mask 
            // like 100000, 110000, 111000.. 
            mask |= (1 << i); 

            for (int j = 0; j < n; ++j)  
            { 

                // Just keep the prefix till 
                // i'th bit neglecting all 
                // the bit's after i'th bit 
                se.add(a.get(j) & mask); 
            } 

            int newMaxx = maxx | (1 << i); 

            for (int prefix : se) 
            { 

                // find two pair in set 
                // such that a^b = newMaxx 
                // which is the highest 
                // possible bit can be obtained 
                if (se.contains(newMaxx ^ prefix)) 
                { 
                    maxx = newMaxx; 
                    break; 
                } 
            } 

            // clear the set for next 
            // iteration 
            se.clear(); 
        } 
        return maxx; 
    }    
}




