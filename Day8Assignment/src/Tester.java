
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String test="a b c d";
		String str[]=test.split("");
		for(int i=0; i<str.length;i++)
		{
			System.out.println(str[i].charAt(0)-32+" ");
		}*/
		
		String string="helloo";
		int count=0;
		char[] c=string.toCharArray();
		for(int i=0; i<c.length; i++)
		{
			int first=string.indexOf(c[i]);
			int last=string.lastIndexOf(c[i]);
			if(first==last)
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
