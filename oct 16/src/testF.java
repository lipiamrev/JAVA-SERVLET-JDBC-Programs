
public class testF {
public static void main(String[] args) {
	card r = new card();
	card k = new card();
	card m = new card();
	
	r.swipe();
	k.swipe();
	m.swipe();
	r.swipe();
	m.swipe();
	r.swipe();
	
	System.out.println("Total count is "+card.orgcount);
}
}
