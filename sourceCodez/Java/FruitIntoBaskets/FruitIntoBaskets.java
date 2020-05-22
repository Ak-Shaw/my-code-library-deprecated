import java.io.*;
import java.util.*;

class FruitIntoBaskets {

    public int totalFruit(int[] trees) {

        if (trees.length == 0) {

            return 0;
        }

        if (trees.length == 1) {

            return 1;
        }

        // To store the count of fruits in current window.
        Map<Integer, Integer> fruit_map = new HashMap<>();

        int fruit, window_start_ptr = 0, window_end_ptr = 0, max_fruit_count = 0;

        for(; window_end_ptr < trees.length; window_end_ptr++) {
            
            // Adding fruit to current window.
            fruit = trees[window_end_ptr];
            fruit_map.put(fruit, fruit_map.getOrDefault(fruit, 0) + 1);

            // If we hit either of the stopping criteria.
            //
            // 1.   Calculate the current_fruit_count and max_fruit_count.
            // 2.   Shrink window size to fit criteria.
            if (fruit_map.size() > 2 || window_end_ptr == trees.length - 1) {

                int current_fruit_count = window_end_ptr - window_start_ptr;

                // If the fruit_map.size falls under
                // criteria, then we need to consider the 
                // last fruit added to fruit_map.
                if (fruit_map.size() <= 2) {

                    current_fruit_count++;
                }

                max_fruit_count = Math.max(max_fruit_count, current_fruit_count);

                while (fruit_map.size() > 2) {

                    fruit = trees[window_start_ptr++];

                    fruit_map.put(fruit, fruit_map.get(fruit) - 1);

                    if (fruit_map.get(fruit) == 0) {

                        fruit_map.remove(fruit);
                    }
                }
            }
        }

        return max_fruit_count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int trees[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            trees[i] = scanner.nextInt();
        }
        int result = new FruitIntoBaskets().totalFruit(trees);
        System.out.println(result);
	scanner.close();
    }
}
