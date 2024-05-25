package Member;

public class Member {
	private int id;
	private String name;
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void ShowData() {
		System.out.println(id+"\t"+name);
	}
	
}
