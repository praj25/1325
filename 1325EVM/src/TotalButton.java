
public class TotalButton implements Button{

	//CU cu = new CU();
	Candidate c=new Candidate();
	@Override
	public void pressed() {
		// TODO Auto-generated method stub
		CU cu = new CU();
		cu.totalVote(c);
		
		
	}

	@Override
	public void pressed(int id) {
		// TODO Auto-generated method stub
		
	}

}
