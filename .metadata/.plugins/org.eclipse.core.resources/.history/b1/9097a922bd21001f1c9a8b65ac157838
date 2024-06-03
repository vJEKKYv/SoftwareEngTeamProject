package main;
import memberManage.MemberManager;

/*
 * 시스템 실행을 담당하는 메인 함수 선언 객체. 
 * MainMenu의 Issue에서 넘어온 숫자를 switch로 분류.
 */

public class MMP {
	private static int MAX_MEMBER_NUM = 50; //MemberManager에서 사용할 리스트 크기 선언
	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		MemberManager MM = new MemberManager(MAX_MEMBER_NUM);	MM.Init();	//기본 데이터 추가. 
		while(true) {
			switch (menu.Issue()) {
			case 1:{	//멤버등록
				MM.AddMember();
				continue;
			}
			case 2:{	//멤버출력
				MM.ShowAllMembers();
				continue;
			}
			case 0:{	//종료
				return;
			}
			default: //메뉴에 없는 값이 입력 될 경우
				System.out.println("옳지 않은 값입니다. ");
			}
		}
	}

}
