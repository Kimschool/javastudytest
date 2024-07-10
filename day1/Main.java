package day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("IDを入力して！");

		String id = sc.next();

		System.out.println("PWを入力して！");

		String pw = sc.next();

		if(id.equals("admin") && pw.equals("123")) {
			System.out.println("ログイン成功");
		} else {
			System.out.println("ログイン失敗");
		}

		sc.next();

	}

}
