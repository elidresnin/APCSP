import java.util.ArrayList;

public class listArray {

	public static int countIntList(ArrayList<Integer> list, int num) {
		int count =0;
		for(int i = 0; i < list.size(); i ++) {
			if (list.get(i) == num) {
				count ++;
			}
		}
		return count;
	}
	public static ArrayList<Integer> numsLowerThan(ArrayList<Integer> nums, int limit){
		ArrayList<Integer> x = new ArrayList<Integer>();
		for(int i = 0; i < nums.size(); i ++) {
			if (nums.get(i) < limit) {
				x.add(nums.get(i));
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		
		System.out.println(countIntList(nums, 1));
		System.out.println(numsLowerThan(nums, 1));
		

	}

}
