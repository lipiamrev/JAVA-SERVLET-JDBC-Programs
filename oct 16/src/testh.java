
public class testh {
public static void main(String[] args) {
	thirdgen t = new thirdgen();
	t.call();
	t.msg();
	t.radio();
	t.camera();
	
	Secgen s = new Secgen();
	s.call();
	s.msg();
	s.radio();
	
	firstgen f = new firstgen();
	f.call();f.msg();
}
}
