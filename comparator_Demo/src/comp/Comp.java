package comp;

import java.util.Comparator;

public class Comp implements Comparator<Laptop>{


	
	@Override
	public int compare(Laptop arg0, Laptop arg1) {
		int laptop1_Ram = arg0.getRam();
		int laptop2_Ram = arg1.getRam();
		if(laptop1_Ram > laptop2_Ram)
			return 1;
		if(laptop1_Ram < laptop2_Ram)
			return -1;
		else 
			return 0;
	}

}
