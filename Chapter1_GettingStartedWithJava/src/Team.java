
public class Team {

	Member member;

	public Team(Member m) {
		this.member = m;
	}

	public static void main(String[] args) {
		Member member = new Member("Virat", "Kohli", "Captain", 18);

		Team team = new Team(member);
		System.out.println(team.member.getFirstName());
		System.out.println(team.member.getLastName());
		System.out.println(team.member.getRole());
		System.out.println(team.member.getNumber());

	}

}

class Member {

	private String firstName;
	private String lastName;
	private String role;
	private int number;

	public Member(String fName, String lName, String rl, int no) {
		this.firstName = fName;
		this.lastName = lName;
		this.role = rl;
		this.number = no;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getRole() {
		return this.role;
	}

	public Integer getNumber() {
		return this.number;
	}
}