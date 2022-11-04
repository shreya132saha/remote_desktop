
public class Question1 implements Question1a {
	public void print(int a) {
		System.out.println(a);
	}

	public static void main(String args[]) {

		Question1a q1a = new Question1();
		q1a.details();
		q1a.detailsnew();
		q1a.print(4);

	}

}
