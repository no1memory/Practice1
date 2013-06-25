package practice.practice1.hanoi;

import java.util.ArrayDeque;
import java.util.Deque;

public class Tower {
	private Deque<Integer> stack = new ArrayDeque<>();
	private String name;

	public Tower(String name) {
		this.setName(name);
	}

	public Tower(String name, int initial){
		this.setName(name);
		for (int i = initial ; i > 0; i --) {
			push(i);
		}
	}

	public Tower(String name, Integer initialArray[]){
		this.setName(name);
		for (int i = initialArray.length -1 ; i >= 0; i --) {
			push(initialArray[i]);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer peek() {
		return stack.peek();
	}

	public Integer pop() {
		return stack.pop();
	}

	public void push(Integer value) {
		if (!isEmpty() && peek() < value)
			throw new IllegalArgumentException("頂点にある板より大きい板を積もうとしています");
		stack.push(value);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public Integer[] toArray() {
		return stack.toArray(new Integer[0]);
	}	
}