package com.test;

public class Sample {
	public void boss(int id) {
		System.out.println(id);
	}
	public void boss(int idd,String name,long phno) {
		System.out.println(idd);
		System.out.println(name);
		System.out.println(phno);
	}
	public void boss(int ID,String Name) {
		System.out.println(ID);
		System.out.println(Name);
	}
	public static void main(String[] args) {
		Sample s =new Sample();
		s.boss(10);
		s.boss(12, "Boss", 9835235353l);
		s.boss(13,"Kash");
	}

}
