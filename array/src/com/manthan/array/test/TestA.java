package com.manthan.array.test;

public class TestA {
	
	public static void main(String[] args) {
		
		int[] a = new int[4];
		
		a[0]= 24;
		a[1] = 10;
		a[2] = 4;
		a[3] = 5;
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		String[] str = new String[4];
		
		str[0]= "Dimple";
		str[1]= "Chinnu";
		str[2]= "Raju";
		str[3] = "Priya";
		
		for(int j =0; j<str.length; j++) {
			System.out.println(str[j]);
			
		}
		
		String[] strr = {"gh","df","gh","ju"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(strr[i]);
			}
		
		for (int i=strr.length-1; i >= 0; i--) {
			System.out.println(strr[i]);
			
		}
		
		
		double[] b = new double[4];
		
		b[0] = 2.8;
		b[1] = 6.5;
		b[2]= 455.25;
		b[3]=410.225;
		
		//for(int k = 0 ; k<b.length; k++) {
			//System.out.println(b[k]);
			
		//}
		
		for(double bb : b) {
			System.out.println(bb);
		}
		
		
		char[] ch = new char[4];
		
		ch[0]= 'a';
		ch[1]='p';
		ch[2]='p';
		ch[3]='l';
		
		for (int l = 0; l < ch.length; l++) {
			System.out.println(ch[l]);
		}
		
	}

}
