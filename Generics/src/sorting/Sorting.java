package sorting;

public class Sorting {

	public static void main(String[] args){
		
		System.out.println(max(12,10,15));
		System.out.println(max("apples","tots","chicken"));
		
	}
	
	public static<T extends Comparable<T>> T max(T x,T y,T z){
		T max = x;   //assuming that x is max for now
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max=z;
		
		return max;
		
	}
	
	
}
