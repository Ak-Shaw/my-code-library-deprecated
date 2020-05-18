import java.util.*;

class ReverseEvenElements{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> inp=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			inp.add(sc.nextInt());
		sc.close();
		ListNode head=ListNode.createList(inp);
		Solution so=new Solution();
		head=so.reverseEvenElements(head);
		List<Integer> ans=ListNode.extractList(head);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+" ");
		}
	}
}
