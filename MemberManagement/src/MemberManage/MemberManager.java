package memberManage;
import java.util.*;
import member.Member;

/*
 * 멤버를 추가, 저장, 출력하기 위한 객체
 */

public class MemberManager {
	int index;				// 데이터 삽입이 가능한 칸을 표시하는 변수. 
	private Member mList[];	// 멤버 저장 리스트
	Scanner scan;
	// MemberManager가 관리한 Member의 크기를 입력 받아 결정. 
	public MemberManager(int max) {	// 멤버리스트의 크기 입력 받아서 초기화. 
		index = 0;	// 최초 선언시 0으로 초기화해 첫칸부터 삽입 가능함 알려줌. 
		mList = new Member[max];
		scan = new Scanner(System.in);
	}
	
	// 멤버 기본 데이터 선언
	public void Init() {
		mList[index++] = new Member(index, "김철수");
		mList[index++] = new Member(index, "이영희");
		mList[index++] = new Member(index, "George Washington");
		mList[index++] = new Member(index, "Joe Biden");
	}
	// Member 등록
	public void AddMember() {
		if(index >= mList.length) {	// 멤버 추가시 리스트를 벗어나서 추가하지 못하도록 함. 
			System.out.println("리스트가 가득 찼습니다. ");
			System.out.println("멤버를 더 추가할 수 없습니다. ");
			return;
		}
		int id = index+1;	// id는 자동으로 배정. id 순서대로 저장 되어 있으니 저장되는 위치보다 1 큰 값을 id로 선언. 
		String name;
		
		System.out.println("id = "+id);
		System.out.print("Name: ");
		name = scan.next();
		// 입력 받은 것 추가
		mList[index++] = new Member(id, name);	//id와 입력받은 name을 저장
	}
	
	// Member 출력
	public void ShowAllMembers() {
		System.out.println("--------------------------------");
		System.out.println("ID\t이름");
		System.out.println("--------------------------------");
		for(int i=0;i<index;i++) {	// index를 이용해 mList의 Member각각 showData함수 실행. 
			mList[i].ShowData();
		}
		System.out.println("--------------------------------");
		
	}
}
