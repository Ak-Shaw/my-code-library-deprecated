import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	int t = sc.nextInt();

    	int[] result = new int[t];

    	for (int i = 0; i < t; i++) {

    		int order = sc.nextInt();
    		int chefs = sc.nextInt();

    		int[] chef_ranks = new int[chefs];

    		for (int j = 0; j < chefs; j++) {

    			chef_ranks[j] = sc.nextInt();
    		}

    		if (chefs == 1) {

    			result[i] = time_required_to_make_x_pizzas(chef_ranks[0], order);
    			continue;
    		}

    		Arrays.sort(chef_ranks);

    		result[i] = number_of_minutes_needed_to_get_the_order_done(order, chef_ranks);
    	}

    	for (int i = 0; i < t; i++) {
    		System.out.println(result[i]);
    	}
    }

    public static int number_of_minutes_needed_to_get_the_order_done(int order, int[] chef_ranks) {

    	int lb = 1, ub = time_required_to_make_x_pizzas(chef_ranks[chef_ranks.length - 1], order), mid = 0;

    	int minimum_time_required = 0;

    	while (lb < ub) {

    		mid = lb + (ub - lb) / 2;

    		if (check(order, chef_ranks, mid)) {

    			minimum_time_required = mid;

    			if (ub == mid) {
    				break;
    			}

    			ub = mid;
    		
    		} else {

    			if (lb == mid) {
    				break;
    			}

    			lb = mid;
    		}
    	}

    	return minimum_time_required;
    }

    public static boolean check(int order, int[] chef_ranks, int minutes) {

    	int total_pizzas_that_can_be_made_in_given_time = 0;

    	for (int chef_rank : chef_ranks) {

    		total_pizzas_that_can_be_made_in_given_time += max_number_of_pizzas_that_the_chef_will_make(order, chef_rank, minutes);
    	}

    	return total_pizzas_that_can_be_made_in_given_time >= order ;
    }

    public static int max_number_of_pizzas_that_the_chef_will_make(int order, int chef_rank, int minutes) {

    	int lb = 0, ub = order, mid = 0, max = 0;

    	while (lb < ub) {

    		mid = lb + (ub - lb) / 2;

    		int time_required_to_make_mid_pizzas = time_required_to_make_x_pizzas(chef_rank, mid);

    		if (time_required_to_make_mid_pizzas <= minutes) {

    			if (max == mid) {
    				break;
    			}

    			max = mid;

    			lb = mid;
    		
    		} else {

    			ub = mid;
    		}
    	}

    	return max;
    }

    public static int time_required_to_make_x_pizzas(int R, int x) {

    	return (R*(x*x - x + 1));
    }
}