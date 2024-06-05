package memberfactory;
import member.Member;
/*
 * 팩토리 메서드 패턴 적용을 위한 객체
 * Member 객체 생성만을 담당.
 */
public class MemberFactory { 
    public Member createMember(int id, String name) {
        return new Member(id, name);
    }
}