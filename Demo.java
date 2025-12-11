class Queue{
	int[] arr=new int[10];
	int front=0,rear=-1;
	void enqueue(int x){
		arr[++rear]=x;
	}
	int dequeue(){
		return arr[front++];
	}
}
public class Demo{
	public static void main(String[] args){
		Queue q=new Queue();
		q.enqueue(15);
		q.enqueue(5);
		int b=q.dequeue();
		int a=q.dequeue();
		System.out.println("addition of 2 numbers: "+(a+b));
		System.out.println("difference of 2 numbers: "+(a-b));
		System.out.println("multiplication of 2 numbers: "+(a*b));
		System.out.println("division of 2 numbers: "+(a/b));
	}
}
