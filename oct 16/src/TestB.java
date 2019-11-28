
public class TestB {
public static void main(String[] args) {
	Van v = new Van();
	Person p = new Person();
	v.cost = 100;
	v.model = 2;
	p.name = "Lipi";
	p.age= 22;
	v.move();
	v.stop();
	p.walk();
	p.eat();
}
}
