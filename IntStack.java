package stack;

public class IntStack {
	private int[] stack;
	private int top;
	private int capacity;
	
	IntStack(int capacity) {
		this.capacity =capacity;
		this.stack = new int [capacity];
	}
	
	public boolean push(int num) {
		if(full()) return false;
		stack[top++] = num;
		//stack[top] = num;
		//top++
		return true;
	}
	public boolean full() {
		return top==capacity;
		//top이 같으면 true
	}
	public int pop() {
		if(empty())return -1;
		
		return stack[--top];
	}
	public boolean empty() {
		return top ==0;
		}
	
	public int top() {
		if(empty()) return-1;
		return stack[top-1];
		}
	
	public int size() {
		return top;
		}
	public int capacity() {
		return capacity;
	}
	
	public void clear() {
		this.top = 0;// this는 없어도 됨 
	}
	
	public void dump() {
		if(empty()) {
			System.out.println("스택이 비어있습니다.");
		}
		else {
		for(int i = 0; i < top; i++) {
			System.out.println(stack[i]+"");
		}
		System.out.println();
	}
	}
}