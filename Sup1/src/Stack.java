
public class Stack {
	private LinkList stack = null;
	
	void push(int x){
		if(empty())
			stack = new LinkList(x, null);
		else
			stack = stack.cons(x);
	}
	
	void pop(){
		if(!empty())
			stack.dropFirst();
	}
	
	int peep(){
		return stack.getHead();
	}
	
	int search(int x){
		return stack.indexOf(x) + 1;
	}
	
	public String toString(){
		return empty() ? "empty" : stack.toString();
	}
	
	boolean empty(){
		return stack == null;
	}
}
