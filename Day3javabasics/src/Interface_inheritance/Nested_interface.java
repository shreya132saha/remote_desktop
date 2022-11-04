package Interface_inheritance;

public interface Nested_interface {
	interface nested_interface2 {

		class A {
			interface Message {
				void msg();
			}
		}
	
	class TestNestedInterface2 implements A.Message{  
	 public void msg()
	 {
		 System.out.println("nested interface");
		 }  
	}
	 public static void main(String args[]){  
	  A.Message message=new TestNestedInterface2();  
	  message.msg();  
	 }  
	
}
}