package Main;
import java.util.*;
public class MainMenu {
	private int curMenu;
	Scanner scan;
	public MainMenu() { scan = new Scanner(System.in); }
	public int Issue() {
		System.out.println("--< 메 뉴 >--------");
		System.out.println("  1. 멤버등록");
		System.out.println("  2. 멤버출력");
		System.out.println("");
		System.out.println("  0. 종료");
		System.out.println("-----------------");
		System.out.print("  선택>> ");
		curMenu = scan.nextInt();
		return  curMenu;
	}
}