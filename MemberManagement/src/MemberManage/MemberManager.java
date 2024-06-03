package MemberManage;
import Member.Member;
import java.util.*;
/*
 * 멤버를 추가, 저장, 출력하기 위한 객체
 */
public class MemberManager {
	int index;	//데이터 삽입이 가능한 칸을 표시하는 변수. 
	private Member mList[];
	Scanner scan;
	//MemberManager가 관리한 Member의 크기를 입력 받아 결정. 
	public MemberManager(int max) {
		index = 0;
		mList = new Member[max];
		scan = new Scanner(System.in);
	}
	
	//멤버 기본 데이터 선언
	public void Init() {
		mList[index++] = new Member(index, "김철수");
		mList[index++] = new Member(index, "이영희");
		mList[index++] = new Member(index, "George Washington");
		mList[index++] = new Member(index, "Joe Biden");
	}
	//Member 등록
	public void AddMember() {
		if(index >= mList.length) {	//멤버 추가시 리스트를 벗어나서 추가하지 못하도록 함. 
			System.out.println("리스트가 가득 찼습니다. ");
			System.out.println("멤버를 더 추가할 수 없습니다. ");
			return;
		}
		int id = index+1;
		String name;
		
		System.out.println("id = "+id);
		System.out.print("Name: ");
		name = scan.next();
		//입력 받은 것 추가
		mList[index++] = new Member(id, name);
	}
	
	//Member 출력
	public void ShowAllMembers() {
		System.out.println("--------------------------------");
		System.out.println("ID\t이름");
		System.out.println("--------------------------------");
		//멤버 각각 출력
		for(int i=0;i<index;i++) {
			mList[i].ShowData();
		}
		System.out.println("--------------------------------");
		
	}
}
