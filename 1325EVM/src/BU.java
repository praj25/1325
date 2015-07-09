import java.util.ArrayList;


public class BU implements EVM {
	
	//CandidateButton cb = new CandidateButton();
	Counter ct[] = new Counter[4];
	Candidate c[]=new Candidate[4];
	CandidateLamp cl = new CandidateLamp();
	ArrayList<Integer> slot = new ArrayList<Integer>(5);
	

	void marking(int slot,String name)
	{
		c[slot] = new Candidate(name); 
	
	}
	
	void poll(int id)
	{
		ct[id] = new Counter();
		ct[id].inccount();
		cl.glow();
	}
	
	
}

