package lambda_Demo;

public class Lambda {

	public static void main(String[] args){
	    
		System.out.println();
	//Make reference of Functional_interface
		Functional_interface addition;
		addition = (x,y)->(x+y);   //Make use of Functional_interface
		System.out.println("The Sum is: "+  addition.MathOperation(2, 4));
		
	verdict say;
	say = (X,Y)->System.out.print(X + " is " + Y);
	say.say_about_subject("Physics","Cool");
	}
	
	
	
	
}
// for using Lambda First make Functional Interface
interface Functional_interface{
	int MathOperation(int a,int b);   //Functional Interface is an abstract class with only one abstract method
}

interface verdict{
	void say_about_subject(String Subject,String choice);
}