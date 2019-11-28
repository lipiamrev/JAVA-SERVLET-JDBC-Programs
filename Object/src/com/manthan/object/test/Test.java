package com.manthan.object.test;

public class Test {
public static void main(String[] args) {
	
	Animal a = new Cow();
	a.cost = 10;
	System.out.println(a.cost);
	a.eat();
	
	Cow c = (Cow)a;
	
	c.eat();
	c.cost= 20;
	c.size=62;
	System.out.println(c.cost+"  "+c.size);
	c.run();
	
	
}
}
