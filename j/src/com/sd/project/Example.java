package com.sd.project;
import java.util.Scanner;

public class Example {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 -> ����, 2 -> ����");
		System.out.print("��ȣ�� �Է��ϼ��� : ");

		int i = sc.nextInt();

		if(i == 1){
			GameGUI g = new GameGUI();
		}else if(i == 2) {
			System.out.println("����Ǿ����ϴ�.");
		}
	}
}