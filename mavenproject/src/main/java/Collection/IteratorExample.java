package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> s=new ArrayList<String>();
		s.add("renjini");
		s.add("chikku");
		s.add("devika");
		s.add("anju");
		System.out.println(s);
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(s);
	}

}
