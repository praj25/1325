import java.util.ArrayList;


public class EVMTest {

	public static void main(String[] args) {
		BU b = new BU();
		TotalButton t = new TotalButton();
	
		Candidate c = new Candidate();
		c.setCandidateNo(1);
		System.out.println(c.getCandidateNo());
		//c.add(c1);
		b.marking(1,"Shilpa");
		b.poll(1);
		t.pressed();
		
	}

	

}
