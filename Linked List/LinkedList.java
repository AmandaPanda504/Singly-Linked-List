public class LinkedList{

	private Node head;
	private int size;

	public LinkedList(){
		head = new Node(0);
		this.size = 0;

	}

	public void setSize(){
		this.size = size;
	}

	public int getSize(){
		return this.size;
	}

	public void addElement(int num){

		Node newNode = new Node(num);
		Node current = this.head;

		if(current == null){
			current = newNode;
			size = 1;
		}

		else {
			while(current.next != null){
				current = current.next;
			}

			current.next = newNode;
			current.next.next = null;

			this.size++;

		}

	}

	public void addElementAtIndex(int position, int data){

		Node newNode = new Node(data);
		Node current = this.head;
		int index = 0;
		

		while(index < position-1){
			current = current.next;
			index++;
		}

		newNode.next = current.next;
		current.next  =  newNode;
		size++;

	}

	public void deleteNthElement(int position){
		int index = 0;
		Node current = this.head;

		while(index < position-1){
			current = current.next;
			index++;
		}

		current.next = current.next.next;
		current = current.next;
		size--;

	}

	public void deleteLastElement(){
		Node current = this.head;
		Node prev = null;
		while(current.next != null){
			prev = current;
			current = current.next;
		}
		prev.next = null;
		size--;

	}

	public void show(){
		Node current = this.head;

		while(current.next != null){
			System.out.print(current.data + " " );
			current = current.next;
		}

		System.out.println(current.data);

	}

	public void reverse(){
		Node prev = null;
		Node curr = head;

		while(curr != null){
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}

		//return prev;
		
	}


}
