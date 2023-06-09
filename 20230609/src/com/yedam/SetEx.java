package com.yedam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		// 1. ArrayList<T> 배열
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Hello");

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("--------------------");

		// 2.Set<T> 집합
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		System.out.println(set);

		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("-------------------");

		Set<Member> members = new HashSet<>();
		members.add(new Member("user1", "1111"));
		members.add(new Member("user2", "2222"));
		members.add(new Member("user1", "1111"));

		for (Member member : members) {
			System.out.println(member.getId() + "," + member.getPw());
		}

	}
}
