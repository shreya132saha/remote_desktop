package Stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[])
	{
		Stack<Integer>stack=new Stack<Integer>();
		System.out.println(stack.isEmpty());
		stack.push(50);
		stack.push(100);
		stack.push(150);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		int index=stack.search(150);
		System.out.println(index);
		System.out.println(stack.isEmpty());
	}

}
