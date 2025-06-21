package MUI.FPP_COURSE.lesson8.doublylinked;

public class MyObjectLinkedList {
	Node header;
	MyObjectLinkedList(){
		header = new Node(null);
	}
	
	public void addFirst(Object item){
		Node n = new Node(item);	
		n.next = header.next;
		n.previous = header;	
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;	
	}
	
	public void addLast(Object item) {
		Node n = new Node(item);
		Node last = header;
		while(last.next != null) {
			last = last.next;
		}
        last.next = n;
        n.previous = last;
	}
	
	//removes node in last position
	public void removeLast( ) {
		//if list is empty, return
		if(header.next == null) return;
		
		Node current = header;
		//traverse the list until current.next is 
		//null - then remove current
		while(current.next != null) {
			current = current.next;
		}
		//now current.next == null, so remove current
		Node previous = current.previous; 
		//previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}
	
	//determines whether the input string is in the list
	public boolean search(Object s) {
		Node next = header.next;
		while(next != null && !next.value.equals(s)) {
			next = next.next;
		}
		//either next == null or next.value is s
		if(next == null) return false;
		else {//next.value.equals(s) 
			return true;
		}
	}
	public String toString() { 
		var sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if(result.length() == 0) return "<empty list>";
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;			
	}
	class Node {
		Object value;
		Node next;
		Node previous;
		Node(Object value){
			this.value = value;
		}	
		public String toString() {
			return value == null ? 
				"null" : value.toString();
		}
	}

	public static void main(String[] args){
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
	}
}
