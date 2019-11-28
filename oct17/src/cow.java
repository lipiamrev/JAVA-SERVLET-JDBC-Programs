
public class cow {
	cow() {
	
		System.out.println("zero cow");
	}
	cow(int a){
		this(2.4);
		System.out.println("int cow");
	}
	cow(double b) {
		this();
		System.out.println("double cow");
	}
}
