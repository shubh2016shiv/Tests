package generic_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Box<String> string_object = new Box<String>("Shubham Singh");
     Box<Integer> int_object = new Box<Integer>(10);
     Box<Character> char_object = new Box<Character>('a');
		
	System.out.println(string_object.getT());
	System.out.println(int_object.getT());
	System.out.println(char_object.getT());
		
	}

}
