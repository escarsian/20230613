package com.yedam.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello"); // String => hashcode, equals
		System.out.println(set.size());

		Iterator<String> iter = set.iterator(); // 반복자 지정.
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println("-------------");
		for (String str : set) {
			System.out.println(str);
		}

		// 중복된 값 제거.
		Set<Integer> iSet = new HashSet<>();
		iSet.add(100);
		iSet.add(200);
		iSet.add(100);
		System.out.println("-------------");
		for (Integer str : iSet) {
			System.out.println(str);
		}

		// 정수[] 선언. 임의 값을 저장.(1~10) : 5개 저장.
		int[] numbers = new int[5];
		// 중복 저장 불가.
		Set<Integer> nSet = new HashSet<>();
		while (nSet.size() < 5) {
			//set 컬렉션의 크기가 5 미만인 동안 값 추가.
			nSet.add((int) (Math.random() * 10 + 1));
		}
		int idx = 0; //numbers 배열의 인덱스로 사용.
		Iterator<Integer> itr = nSet.iterator();
		while (itr.hasNext()) {
			numbers[idx++] = itr.next();
		}
		System.out.println("------numbers-------");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}
}
