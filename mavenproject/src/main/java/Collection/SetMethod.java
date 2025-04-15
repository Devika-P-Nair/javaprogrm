package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {

	public static void main(String[] args) {
		Set <String> s=new HashSet<String>();
		s.add("red");
		s.add("green");
		s.add("violet");
		s.add("yellow");
		s.add("magenta");
		System.out.println(s);
		
		Set <String> s1=new HashSet<String>();
		s1.add("orange");
		s.add("black");
		s.add("white");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s.contains("yellow"));
		
		System.out.println(s.containsAll(s1));
		
		System.out.println(s1.containsAll(s));
		
		System.out.println(s.isEmpty());
		
		s.removeAll(s1);
		System.out.println(s);
		
		System.out.println(s.size());
		
		s1.clear();
		System.out.println(s1);
		
		
		
		

	}

}
