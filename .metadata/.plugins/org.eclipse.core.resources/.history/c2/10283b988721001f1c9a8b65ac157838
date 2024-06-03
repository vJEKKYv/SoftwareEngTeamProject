package MemberManage;
import Member.Member;
import java.util.*;
public class MemberManager {
	int index;
	private Member mList[];
	Scanner scan;
	public MemberManager(int max) {
		index = 0;
		mList = new Member[max];
		scan = new Scanner(System.in);
	}
	public void init() {
		mList[index++] = new Member(index, "김철수");
		mList[index++] = new Member(index, "이영희");
		mList[index++] = new Member(index, "George Washington");
		mList[index++] = new Member(index, "Joe Biden");
	}
	public void AddMember() {
		int id = index+1;
		String name;
		System.out.println("id = "+id);
		System.out.print("Name: ");
		name = scan.next();
		mList[index++] = new Member(id, name);
	}
	public void ShowAllMembers() {
		System.out.println("--------------------------------");
		System.out.println("ID\t이름");
		System.out.println("--------------------------------");
		for(int i=0;i<index;i++) {
			mList[i].ShowData();
		}
		System.out.println("--------------------------------");
		
	}
}
