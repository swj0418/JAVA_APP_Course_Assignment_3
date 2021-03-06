class Sports {
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n players in " + getName() );
	}
	
	String getNumberOfTeamMembersReturn()
	{
		return "Each team has n players in " + getName();
	}
}

class Soccer extends Sports{
	@Override
	String getName() {
		return "Soccer Class";
	}
	
	@Override
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has " + 11 + " players in a " + getName());
	}
	
	@Override
	String getNumberOfTeamMembersReturn()
	{
		return "There are " + 11 + " players in a soccer team";
	}
}

public class Main {
	public static void main(String[] ar)
	{
		Sports sports = new Sports();
		Soccer soccer = new Soccer();
		
		System.out.println(sports.getName());
		sports.getNumberOfTeamMembers();
		System.out.println(soccer.getName());
		soccer.getNumberOfTeamMembers();
	}

}
