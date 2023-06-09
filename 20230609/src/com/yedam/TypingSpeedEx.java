package com.yedam;

import java.util.Scanner;

public class TypingSpeedEx {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis(); // 시작 시간.
		// 문장 출력. > 입력: type > 문장 출력 > 입력 : value,.... 문장 다 제거.
		// 완료: 완료 메세지: 실행했던 시간 80초 -> 1분 20초.

		String origin = "The Character class wraps a value"; // of the primitive type char in an object. An object of
																// class Character contains a single field whose type is
																// char.";

		System.out.println(origin);
		String[] origins = origin.split(" "); // 공백마다 나눔.

		Scanner scn = new Scanner(System.in);

		System.out.println("입력> ");
		String typing = scn.nextLine();

		boolean run = true;
		while (run) {
			if (!checkAry(origins)) {
				break;
			}
//			System.out.println(ArrayToString(origins));
			for (int i = 0; i < origins.length; i++) {
				if (origins[i] != null && origins[i].equals(typing)) {
					origins[i] = null;
					break;
				}
//				else if(origins[i] == null) {
//					run = false;
//				}
			}
		}
		long time2 = System.currentTimeMillis(); // 끝 시간.
		long result = time1 - time2;

		System.out.printf("완료. 소요시간: %d", Duration(time1, time2));

	}

	public static boolean checkAry(String[] ary) {
		boolean isLeft = false;
		for (String word : ary) {
			if (word != null) {
				isLeft = true;
				break;
			}
		}
		return isLeft;
	}

	public static String Duration(long time1, long time2) {
		long result = (time1 - time2) * 1000;
		long min = result / 60;
		long sec = result % 60;
		return min + "분" + sec + "초";
	}
}
