package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m00 = new Member("jws", "정우성", 50000);
		m00.showInfo();

		Member m01 = new Member("yjs", "유재석", 30000);
		m01.showInfo();
		
		Member m02 = new Member("lhr", "이효리", 40000);
		m02.showInfo();
	}

}
