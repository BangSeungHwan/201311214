package com.sd.project;
import java.util.Scanner;

public class Example {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 -> 시작, 2 -> 종료");
		System.out.print("번호를 입력하세요 : ");

		int i = sc.nextInt();

		if(i == 1){
			GameGUI g = new GameGUI();
		}else if(i == 2) {
			System.out.println("종료되었습니다.");
		}
	}
}