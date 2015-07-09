
public class CU implements EVM{

	//Candidate cd=new Candidate();
	Counter c[] = new Counter[4];
	TotalButton tb = new TotalButton();
	int total=0;
	
	int totalVote(Candidate cd)
	{
		int num = cd.getCandidateNo();
		//c[id] = new Counter();
		System.out.println("hhghg");
		System.out.println(num);
		for(int i=1;i<=num;i++)
		{
			c[i] = new Counter();
			total = total + c[i].getCount();
		}
		return total;
	}
}
