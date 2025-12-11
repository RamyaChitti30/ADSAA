class LinkedList{
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	Node head;
	void insert(int x){
		Node newNode=new Node(x);
		if(head==null){
			head=newNode;
		}else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
public class Test{
	public static void main(String[] args){
		LinkedList ll=new LinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.display();
	}
}
