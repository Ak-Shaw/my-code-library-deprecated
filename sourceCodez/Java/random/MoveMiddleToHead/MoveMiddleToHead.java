import java.util.*;


class MoveMiddleToHead{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> input=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			input.add(sc.nextInt());
		ListNode head=ListNode.createList(input);
		Solution so=new Solution();
		ListNode start=so.moveMiddleToHead(head);
		List<Integer> ans=ListNode.extractList(start);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+" ");
		} 

	}
}
