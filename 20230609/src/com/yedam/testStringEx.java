package com.yedam;

public class testStringEx {
	public static void main(String[] args) {
		String str;
		str = "The class String includes methods for examining individaul...";
		String[] strs = str.split(" "); //( ) 안의 값을 기준으로 나눠서 출력.
		int cnt = 0;
		for (String word : strs) {
			System.out.println(word.indexOf("for")); 
			if(word.indexOf("for")==0) {
				cnt++;
			}
		}
		System.out.printf("for 횟수 : %d\n", cnt);
		
		str = "c:/temp/images/sample.jpg";
		System.out.println("파일명: "+ str.substring(str.lastIndexOf("/")+1, str.indexOf(".")));
		System.out.println("확장명: "+ str.substring(str.indexOf(".")+1));

		String[] ssn = { "950102-1234567", "960405 2345678", "9703041234567", "050101345678", "0604014545678",
				"250903-3234567" };
		
		
		for (String s : ssn) {
			String result = check(s);
			System.out.printf("번호 %s, %s\n", s, result);
		}

	}

	public static String check(String str) {
		int year = Integer.parseInt(str.substring(0, 2));
//		System.out.println(year);
		String gender = str;
		gender = gender.replace("-", "").replace(" ", "");
		
		char c = gender.charAt(6);
		if (c == '1' && (year > 23)) {
			return "남";
		} else if (c == '3' && (year <= 23)) {
			return "남";
		} else if (c == '2' && (year > 23)) {
			return "여";
		} else if (c == '4' && (year <= 23)) {
			return "여";
		}
		return null;
	}
}
