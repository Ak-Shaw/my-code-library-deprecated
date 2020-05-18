import java.io.*;
import java.util.*;

class Partition {

  public static void  main (String args []) {
    Scanner sc =  new  Scanner (System.in);

    int n = sc.nextInt();
    ArrayList <Integer> list = new ArrayList<Integer> ();
    int x;
    for ( int i = 0 ; i < n; i++) {
      x = sc.nextInt();
      list.add(x);
    }
    ListNode head = ListNode.createList(list);
    int k = sc.nextInt();
    if (n > 0)
      head = Solution.partition(head, k);

    List<Integer> nums = ListNode.extractList(head);

    for ( int i = 0; i < nums.size() ; i++) {
      System.out.print(nums.get(i)  + " ");
    }

  }

}
