package com.yedam.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<String> strList;
		strList = new ArrayList<String>();
		strList.add("Hello"); // index 값 : 0
//		strList.add(100);
		strList.add("World"); // index 값 : 1
		strList.add(0, "Good");

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i).toString());
		}
		System.out.println("-------------");
		strList.set(0, "Nice"); // index값에 맞춰서 변경.
		strList.remove(0);
		strList.clear();
		for (String word : strList) {
			System.out.println(word);
		}
		
		
		
		// ArrayList, LinkedList
		long start = System.currentTimeMillis();
		strList = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			strList.add(0, "i" + i);
		}
		long end = System.currentTimeMillis();
		System.out.printf("ArrayList 걸린 시간 %d\n", (end-start));
		
		System.out.println("-------------");
		
		start = System.currentTimeMillis();
		strList = new LinkedList<String>(); // 인터페이스 변수 = 모든 구현클래스.
		for (int i = 0; i < 100000; i++) {
			strList.add(0, "i" + i);
		}
		end = System.currentTimeMillis();
		System.out.printf("LinkedList 걸린 시간 %d", (end-start));
	}
}
