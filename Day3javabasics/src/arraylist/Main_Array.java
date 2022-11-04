package arraylist;
import java.util.*;
public class Main_Array {
	public static void main(String args[])
	{
		Candidate c1=new Candidate(1234, "Java", "Accenture");
		Candidate c2=new Candidate(1534, "Sap", "Accenture");
		Candidate c3=new Candidate(1934, "DBMS", "Accenture");
		ArrayList <Candidate>ar=new ArrayList<Candidate>();
		ar.add(c1);
		ar.add(c2);
		ar.add(c3);
		/*Iterator<Candidate>iterator=ar.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}*/
		for(Candidate candidate:ar)
		{
			System.out.println(candidate.EID);
			System.out.println(candidate.stream);
			System.out.println(candidate.company);
		}
		
	}

}
