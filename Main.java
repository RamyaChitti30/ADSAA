class Stack{
	int[] arr=new int[10];
	int top=-1;
	void push(int x){
		arr[++top]=x;
	}
	int pop(){
		return arr[top--];
	}
}
public class Main{
	public static void main(String[] args){
		Stack m=new Stack();
		m.push(20);
		m.push(10);
		int b=m.pop();
		int a=m.pop();
		System.out.println("addition of 2 numbers is: "+(a+b));
		System.out.println("difference of 2 numbers is: "+(a-b));
		System.out.println("product of 2 numbers is: "+(a*b));
		System.out.println("division of 2 numbers is: "+(a/b));
	}
}
