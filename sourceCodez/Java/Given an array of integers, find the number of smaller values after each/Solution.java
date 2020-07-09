import java.util.*;

class Solution{ 
	public ArrayList<Integer> countOfSmallerNumberAfterSelf(int[] nums) 
	{
		SegmentTree tree = new SegmentTree(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);

		ArrayList<Integer> result = new ArrayList<>(nums.length);

		for (int i = nums.length - 1; i >= 0; i--) {
			result.add(tree.query(Integer.MIN_VALUE, nums[i] - 1));
			tree.update(nums[i], 1);
		}

		Collections.reverse(result);
		
		return result;
	}
}

class SegmentTree {

	int start, end, value;
	SegmentTree left, right;

	SegmentTree(int start, int end, int value) {

		this.start = start;
		this.end = end;
		this.value = value;
		this.left = null;
		this.right = null;
	}

	int query(int l, int r) {

		if (this.start > r || this.end < l) return 0;

		if (this.start >= l && this.end <= r) {
			return this.value;
		}

		int leftAns = 0, rightAns = 0;

		if (this.left != null) {
			leftAns = this.left.query(l, r);
		}

		if (this.right != null) {
			rightAns = this.right.query(l, r);
		}

		return leftAns + rightAns;
	}

	void update(int index, int val) {

		if (this.start == this.end) {
			this.value += val;
			return;
		}

		int mid = (this.start + this.end) / 2;

		if (this.start + 1 == this.end) {
			mid = start;
		}

		if (index <= mid) {
			if (this.left == null) {
				this.left = new SegmentTree(this.start, mid, 0);
			}
			this.left.update(index, val);
		} else {
			if (this.right == null) {
				this.right = new SegmentTree(mid + 1, this.end, 0);
			}
			this.right.update(index, val);
		}

		this.value = 0;

		if (this.left != null) {
			this.value += this.left.value;
		}

		if (this.right != null) {
			this.value += this.right.value;
		}
	}
}


