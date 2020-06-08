import java.util.*;

public class TowerOfHanoi {
    void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod, ArrayList<String> result) {
        
        if (n == 1) 
        { 
            result.add(n + " " + from_rod + " " + to_rod);
            return; 
        } 
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod, result); 
        result.add(n + " " + from_rod + " " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod, result); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> result = new ArrayList<>();
        new TowerOfHanoi().towerOfHanoi(n, 'A', 'C', 'B', result);
        for(int i = 0 ; i < result.size() ; i++) {
            System.out.println(result.get(i));
        }
    }
}
