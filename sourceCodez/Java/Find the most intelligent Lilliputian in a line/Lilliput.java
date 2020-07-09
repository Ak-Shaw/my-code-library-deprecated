import java.util.*;

public class Lilliput {
    
    public static Vector<Integer> lilliput(int n, int heights[], int num_actions, String actions[]) {
    
        int[] segTree = new int[5 * n];
        Vector<Integer> answer = new Vector<>();

        createSegTree(0, n - 1, 0, heights, segTree);

        for (int i = 0; i < num_actions; i++) {
            String[] action_info = actions[i].split(" ");
            if (actions[i].charAt(0) == 'u') {
                updateSegTree(0, n - 1, 0, Integer.parseInt(action_info[2]), Integer.parseInt(action_info[1]), segTree);
            }
            else if (actions[i].charAt(0) == 'q') {
                answer.add(querySegTree(0, n - 1, 0, Integer.parseInt(action_info[1]), Integer.parseInt(action_info[2]), segTree));
            }
        }

        return answer;
    }

    static int updateSegTree(int l, int r, int node, int val, int index, int[] segTree) {

        if (l == r)
            return segTree[node] = val;

        int mid = (l + r) / 2;

        if (index >= l && index <= mid)
            updateSegTree(l, mid, 2 * node + 1, val, index, segTree);
        else 
            updateSegTree(mid + 1, r, 2 * node + 2, val, index, segTree);
        return segTree[node] = Math.min(segTree[2 * node + 1], segTree[2 * node + 2]);
    }

    static int querySegTree(int l, int r, int node, int start, int end, int[] segTree) {

        if (r < start || l > end)
            return Integer.MAX_VALUE;

        if (l >= start && r <= end)
            return segTree[node];
        int mid = (l + r) / 2;
        return Math.min(querySegTree(l, mid, 2 * node + 1, start, end, segTree), 
                    querySegTree(mid + 1, r, 2 * node + 2, start, end, segTree));
    }

    static int createSegTree(int l, int r, int node, int[] heights, int[] segTree) {

        if (l == r)
            return segTree[node] = heights[l];

        int mid = (l + r) / 2;

        segTree[2 * node + 1] = createSegTree(l, mid, 2 * node + 1, heights, segTree);
        segTree[2 * node + 2] = createSegTree(mid + 1, r, 2 * node + 2, heights, segTree);

        return segTree[node] = Math.min(segTree[2 * node + 1], segTree[2 * node + 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q;

        n = sc.nextInt();
        int heights[] = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        q = sc.nextInt(); // Num actions
        sc.nextLine();

        String actions[] = new String[q];
        for (int i = 0; i < q; i++) {
            actions[i] = sc.nextLine();
        }
        sc.close();

        Vector<Integer> answer = lilliput(n, heights, q, actions);
        for (int i = 0; i < answer.size(); i++)
            System.out.println(answer.get(i));
    }
}
