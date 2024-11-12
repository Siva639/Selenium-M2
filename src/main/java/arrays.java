import java.util.ArrayList;
public class arrays {

	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<>();
		a.add(10);
		a.add("Hello");
		a.add(25);
		a.add(3.14);
		a.add(true);

		System.out.println("Print only integer value");
		for (Object ele : a) {
		if (ele instanceof Integer) {
		System.out.println(ele);
		    }
		}
		}
		

	}


