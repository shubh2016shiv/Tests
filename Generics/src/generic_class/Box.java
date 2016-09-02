package generic_class;

public class Box<T> {

//Make a variable of type T with name t	
private T t;
//Create a constructor that will take t as parameter
Box(T t){
	this.t = t;
}

//Define getters and setters
public T getT() {
	return t;
}

public void setT(T t) {
	this.t = t;
}

	
	
}
