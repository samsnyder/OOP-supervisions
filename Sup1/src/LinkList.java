
class LinkList{
	private int head;
	private LinkList tail;
	
	LinkList(int h, LinkList t){
		this.head = h;
		this.tail = t;
	}
	
	int count(){
		int i = 1;
		for(LinkList next = tail; next != null; next = next.getTail())
			i++;
		return i;
	}
	
	int getNth(int n){
		LinkList next = this;
		for(int i=0; i<n; i++)
			next = next.getTail();
		return next.getHead();
	}
	
	int indexOf(int x){
		int i = 0;
		for(LinkList next = this; next.getHead() != x; next = next.getTail())
			i++;
		return i;
	}
	
	int indexOfObj(LinkList x){
		int i = 0;
		for(LinkList next = this; next != x; next = next.getTail())
			i++;
		return i;
	}
	
	int getHead(){
		return head;
	}
	
	LinkList getTail(){
		return tail;
	}
	
	void setTail(LinkList t){
		tail = t;
	}
	
	LinkList cons(int x){
		return new LinkList(x, this);
	}
	
	void dropLast(){
		LinkList next = this;
		while(next.getTail().getTail() != null)
			next = next.getTail();
		next.setTail(null);
	}
	
	void dropFirst(){
		this.head = tail.getHead();
		this.tail = tail.getTail();
	}
	
	boolean isTailNull(){
		return tail == null;
	}
	
	boolean testCycle(){
		int i = 0;
		LinkList next = this;
		while(next.getTail() != null){
			int index = this.indexOfObj(next);
			if(index < i) return true;
			next = next.getTail();
			i++;
		}
		return false;
	}
	
	public String toString(){
		String res = "";
		LinkList next = this;
		while(next != null){
			res += next.getHead() + ", ";
			next = next.getTail();
		}
		return res.substring(0, res.length() - 2);
	}
}