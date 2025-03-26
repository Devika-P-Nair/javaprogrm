package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <String> s=new ArrayList<String>();
		s.add("apple");
		s.add("orange");
		s.add("grape");
		System.out.println(s);
		System.out.println(s.get(2));
		s.set(2, "banana");
		System.out.println(s);
		s.add("apple");
		System.out.println(s.indexOf("apple"));
		System.out.println(s.lastIndexOf("apple"));
		s.remove(3);
		System.out.println(s);
		System.out.println(s.contains("orange"));
	}

}
