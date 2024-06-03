package member;

/*
 * 멤버의 아이디와 이름을 저장하기 위한 객체
 */

public class Member {
	private int id;
	private String name;
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//멤버의 id와 name 출력
	public void ShowData() {
		System.out.println(id+"\t"+name);
	}
	
}
