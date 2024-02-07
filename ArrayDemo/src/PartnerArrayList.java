import java.util.ArrayList;
public class PartnerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(0);
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		ints.add(5);
		System.out.println(ints);
		System.out.println(ints.size());
		System.out.println(ints.get(0));
		ints.remove(0);
		System.out.println(ints);
		
		ArrayList<Double> dub = new ArrayList<Double>();
		dub.add(3.14159);
		dub.add(6.28319);
		dub.add(9.42478);
		dub.add(12.56637);
		dub.add(15.70796);
		
		System.out.println(dub.size());
		System.out.println(dub);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("E");
		str.add("l");
		str.add("i");
		str.add("D");
		str.add("r");
		str.add("e");
		str.add("s");
		str.add("n");
		str.add("i");
		str.add("n");
		
		System.out.println(str.size());
		System.out.println(str);
		System.out.println();
		

	}

}
