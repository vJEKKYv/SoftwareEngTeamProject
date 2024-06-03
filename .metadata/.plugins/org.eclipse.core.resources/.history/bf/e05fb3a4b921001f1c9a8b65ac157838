package Main;
import MemberManage.MemberManager;
/*
 * 메인 함수 선언 객체. 
 * MainMenu의 Issue에서 넘어온 숫자를 switch로 분류.
 */
public class MMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMenu menu = new MainMenu();
		MemberManager MM = new MemberManager(50);MM.Init();	//기본 데이터 추가. 
		while(true) {
			switch (menu.Issue()) {
			case 1:{
				MM.AddMember();
				continue;
			}
			case 2:{
				MM.ShowAllMembers();
				continue;
			}
			case 0:{
				return;
			}
			default:
				System.out.println("옳지 않은 값입니다. ");
			}
		}
	}

}
