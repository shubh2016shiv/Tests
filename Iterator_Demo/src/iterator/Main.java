package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> items = new ArrayList<>();
		items.add(10);
		items.add(20);
		items.add(30);
		
		Iterator<Integer> iter = items.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

}
