package com.srm.generics;

import java.util.ArrayList;

class Stack<K> {
	ArrayList<K> al;
	int top = -1;
	int len;

	Stack(int len) {
		this.len = len;
		this.al = new ArrayList<K>(len);
	}

	void push(K X) {
		if (top + 1 == len) {
			System.out.println("Stack Full");
		} else {
			top = top + 1;
			if (al.size() > top)
				al.set(top, X);
			else
				al.add(X);
		}
	}

	K top() {
		if (top == -1) {
			System.out.println("Stack Underflow");

			return null;
		} else
			return al.get(top);
	}

	void pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
		}

		else
			top--;
	}

	boolean empty() {
		return top == -1;
	}

	public String toString() {

		String result = "";

		for (int i = 0; i < top; i++) {
			result += String.valueOf(al.get(i)) + "->";
		}

		result += String.valueOf(al.get(top));

		return result;
	}
}

public class StackGenerics {

	public static void main(String[] args) {
		  Stack<Integer> s1 = new Stack<>(5);
	        s1.push(1);
	        s1.push(2);
	        s1.push(3);
	        s1.push(4);
	        s1.push(5);
	        System.out.println("Pushing Elements to S1 : "+s1);
	        s1.pop();
	        System.out.println("s1 after pop :\n" + s1);


	}

}
