
public class marker extends pen{
	marker() {
		this(2);
		System.out.println("marker constructor");
	}
	marker(int a){
		
		System.out.println("a");
	}
	marker(double b){
		super(2);
	}
}
