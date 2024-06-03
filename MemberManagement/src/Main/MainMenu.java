package main;
import java.util.*;

/*
 * User에게 메뉴를 띄우고 숫자를 입력받는 객체
 */

public class MainMenu {
	private int curMenu;
	Scanner scan;
	public MainMenu() { scan = new Scanner(System.in); }
	
	//주메뉴. 메뉴를 띄우고 입력값 반환. 
	public int Issue() {
		while(true) {
			System.out.println("--< 메 뉴 >--------");
			System.out.println("  1. 멤버등록");
			System.out.println("  2. 멤버출력");
			System.out.println("");
			System.out.println("  0. 종료");
			System.out.println("-----------------");
			System.out.print("  선택>> ");
			
			try {	//문자열 입력에 대한 예외처리. integer값이 들어올 때 까지 while 무한루프.
				curMenu = scan.nextInt();
				return  curMenu;
			} catch (InputMismatchException e) {
				System.out.println("Error. 숫자를 입력해주세요. \n");
			}
			
		}
	}
}
