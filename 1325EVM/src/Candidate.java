
public class Candidate {
	
	String name;
	int cNumber;
	CandidateButton cb;

	Counter c = new Counter();
	Candidate()
	{
		
	}
	void setCandidateNo(int cNumber)
	{
		this.cNumber=cNumber;
	}
	
	Candidate(String name)
	{
		this.name=name;
	}

	String getCandidate()
	{
		return name;
	}
	
	int getCandidateNo()
	{
		return cNumber;
	}

}
