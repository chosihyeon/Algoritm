package stack;

public class _intstacktestdescription {

	public class IntStack {
	    private int[] stack; // 정수형 데이터를 저장하는 배열
	    private int top; // 스택의 가장 위에 있는 데이터의 위치를 나타내는 인덱스
	    private int capacity; // 스택의 최대 용량(크기)

	    // IntStack 클래스의 생성자
	    IntStack(int capacity) {
	        this.capacity = capacity; // 전달된 용량으로 초기화
	        this.stack = new int[capacity]; // 용량에 맞게 배열 생성
	    }

	    // 스택에 데이터를 추가하는 메서드
	    public boolean push(int num) {
	        if (full()) // 스택이 가득 찼으면
	            return false; // 추가할 수 없으므로 false 반환
	        stack[top++] = num; // 스택의 top 위치에 데이터 추가 후 top 증가
	        return true; // 성공적으로 추가되었으므로 true 반환
	    }

	    // 스택이 가득 찼는지 확인하는 메서드
	    public boolean full() {
	        return top == capacity; // 스택의 top이 용량과 같으면 가득 찬 것으로 판단
	    }

	    // 스택에서 데이터를 제거하고 반환하는 메서드
	    public int pop() {
	        if (empty()) // 스택이 비어있으면
	            return -1; // 제거할 데이터가 없으므로 -1 반환
	        return stack[--top]; // top 위치의 데이터를 제거하고 반환 후 top 감소
	    }

	    // 스택이 비어있는지 확인하는 메서드
	    public boolean empty() {
	        return top == 0; // 스택의 top이 0이면 비어있는 것으로 판단
	    }

	    // 스택의 가장 위에 있는 데이터를 반환하는 메서드
	    public int top() {
	        if (empty()) // 스택이 비어있으면
	            return -1; // 반환할 데이터가 없으므로 -1 반환
	        return stack[top - 1]; // 스택의 top 위치에 있는 데이터 반환
	    }

	    // 스택에 저장된 데이터의 개수를 반환하는 메서드
	    public int size() {
	        return top; // 스택의 top 위치가 데이터 개수와 동일하므로 그 값을 반환
	    }

	    // 스택의 최대 용량(크기)를 반환하는 메서드
	    public int capacity() {
	        return capacity; // 스택의 용량을 반환
	    }

	    // 스택을 초기화하여 모든 데이터를 제거하는 메서드
	    public void clear() {
	        top = 0; // top을 0으로 설정하여 모든 데이터가 제거되었음을 표시
	    }

	    // 스택에 저장된 데이터를 출력하는 메서드
	    public void dump() {
	        if (empty()) { // 스택이 비어있으면
	            System.out.println("스택이 비어있습니다."); // 메시지 출력
	        } else {
	            for (int i = 0; i < top; i++) { // 스택의 데이터를 처음부터 top까지 반복
	                System.out.println(stack[i] + ""); // 데이터 출력
	            }
	            System.out.println(); // 한 줄 띄우기
	        }
	    }
	}
}
