
public class CandidateButton implements Button {
	
	
	BU b = new BU();
	
	
	public void pressed(int id)
	{
		b.poll(id);
	}


	@Override
	public void pressed() {
		// TODO Auto-generated method stub
		
	}

}
