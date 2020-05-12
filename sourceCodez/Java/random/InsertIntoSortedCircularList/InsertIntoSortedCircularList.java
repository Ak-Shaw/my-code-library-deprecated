/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/
import java.util.*;

class InsertIntoSortedCircularList{
	public static void createCircularList(ListNode head)
	{
		if(head==null)
			return ;
		if(head.next==null)
		{
			head.next=head;
			return ;
		}
		ListNode node=head;
		while(node.next!=null)
		{
			node=node.next;
		}
		node.next=head;
		return ;
	}
	public static void printCircularList(ListNode head)
	{
		if(head==null)
			return;
		else if(head.next==head)
			System.out.println(head.val);
		else
		{
			System.out.print(head.val+" ");
			ListNode node=head.next;
			while(node!=head)
			{
				System.out.print(node.val+" ");
				node=node.next;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> input=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			input.add(sc.nextInt());
		int val=sc.nextInt();
		ListNode head=ListNode.createList(input);
		createCircularList(head);
		Solution so=new Solution();
		ListNode start=so.insertIntoSortedCircularList(head,val);
		printCircularList(start);
	}
}
