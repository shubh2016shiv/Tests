package comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args){
	Laptop l1 = new Laptop("HCL",3);
	Laptop l2 = new Laptop("Toshiba",2);
	Laptop l3 = new Laptop("Samsung",4);
	ArrayList<Laptop> series = new ArrayList<Laptop>();

	series.add(l1);
	series.add(l2);
	series.add(l3);

Collections.sort(series,new Comp());	

for(Laptop l:series){
	System.out.println(l.getBrand());
}

Comparator<Laptop> reverse_Comp = Collections.reverseOrder();
Collections.sort(series, reverse_Comp);

System.out.println("-----------------------------------------\n");
for(Laptop l:series)
System.out.println(l.getBrand());

}
}
