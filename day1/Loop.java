package day1;

import java.util.Scanner;

public class Loop {

	final static String NEW_GAME = "0";
	final static String LOAD_GAME = "1";
	final static String SETTING = "2";
	final static String QUIT_GAME = "3";



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("input num");
		System.out.println("1.new game");
		System.out.println("2.load game");
		System.out.println("3. setting");
		System.out.println("0. exit");
		String input = sc.next();

		while(!input.equals(QUIT_GAME)) {
			System.out.println();

			if(input.equals(NEW_GAME)) {
				System.out.println("new game");

			} else if (input.equals(LOAD_GAME)) {
				System.out.println("load game");
			}

			System.out.println(input + "を入力しました。");
			System.out.println("0 を入力すると終了");
			System.out.println("input num");
			input = sc.next();
		}

		System.out.println("program is finished");
	}

}
