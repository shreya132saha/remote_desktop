package Interface_inheritance;

public class Hybrid_class implements Company, ParticipantA, ParticipantB{

		public static void main(String args[])
	{
	
			Hybrid_class hybrid_class=new Hybrid_class(); 
			hybrid_class.display(1234, "Java", "Apparel");	
	}

		@Override
		public String company_name(String cname) {
			// TODO Auto-generated method stub
			return cname;
		}

		@Override
		public void display(int EID, String stream, String project) {
			// TODO Auto-generated method stub
			System.out.println(EID+"\n"+stream+"\n"+project);
		}

}
