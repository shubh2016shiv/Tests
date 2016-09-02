package generic_methods;

public class Main {

	public static void main(String[] args ){
		
		Integer [] int_array = {1,2,3,4,5};
		Character[] char_array = {'a','b','c','d'};
		// The generic method that prints both the array types
		print(int_array);
		print(char_array);
		
	}
//This one class is used for print instead overloading methods having different parameters of different types
	private static<T> void print(T[] t) {
		for(T x:t){
			System.out.printf("%s",x);
		}
	}
	
	
}
