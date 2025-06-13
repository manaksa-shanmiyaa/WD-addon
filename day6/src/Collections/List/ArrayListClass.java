package Collections.List;
import java.util.ArrayList;
public class ArrayListClass {

	public static void main(String[] args) {
		int[] arr = new int[5];
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.remove(1);
		System.out.println(alist);
	}

}
