
public abstract class Pen {
	int cost;
	void open() {
		System.out.println("open");
	}
	void close() {
		System.out.println("close");
	}
	abstract void write();
	abstract void color();
	
}
