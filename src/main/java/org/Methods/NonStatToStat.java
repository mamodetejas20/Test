package org.Methods;

public class NonStatToStat {
	public static NonStatToStat obj=new NonStatToStat();
	public int a=10;
	public void test1() {
	//	int a=20;
		test2();
		System.out.println("a="+a);
	}
	public static void test2() {
//		NonStatToStat obj=new NonStatToStat();
//		obj.test1();
		System.out.println("*************");
	}
	public void test3() {
		System.out.println("#########");
		test1();
	}
	public static void main(String[] args) {
		int a=20;
		System.out.println(NonStatToStat.obj.a);
		obj.test1();
		obj.test3();
	}

}
