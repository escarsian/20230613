package com.yedam.list;

class Emp {
	int id;
	String name;
}

public class CallByEx {
	public static void main(String[] args) {
		// call by value. 값에 의한 호출
		int a = 10;
		meth1(a);
		System.out.println(a); // 참조되지 않고 출력.

		// call by reference. 참조에 의한 호출
		Emp emp = new Emp();
		emp.name = "홍길동";
		meth2(emp);
		System.out.println(emp.name); // 참조되어 출력.

		// String, Wrapper 객체 > 메소드의 인수로 사용될 경우에는 value로 됨.
		String b = "hello";
		meth3(b);
		System.out.println(b); //참조되지 않고 출력.
	}
	public static void meth1(int a) {
		a = a * a;
	}
	public static void meth2(Emp e) {
		e.name = "김길동";
	}
	public static void meth3(String str) {
		str = "world";
	}
}
