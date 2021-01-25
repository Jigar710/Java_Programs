class sync{
	volatile int n[]=new int[15];
	volatile int p=0;
	String name;
	synchronized void push(String name) {
		this.name=name;
		if(name.equals("StackInsert")){
			for(int i=p;i<15;i++){
				this.n[i]=i+1;
				System.out.println("push: "+n[i]);
				p++;
			}
			System.out.println("Stack is full");
		}
	}
	synchronized void pop(String name){
		this.name=name;
		if(name.equals("StackDelete")){
			for(int i=p-1;i>=0;i--){
				System.out.println("pop: " + n[i]);
				p--;
			}
			System.out.println("Stack is empty");
		}
	}
}
class Delete implements Runnable{
	sync s;
	String name;
	Delete(sync s,String name){
	this.s=s;
	this.name=name;
	new Thread(this,"StackDelete").start();
	}
	public void run(){
		int i=0;
		while(true){
			s.pop(name);
		}
	}
}
class Insert implements Runnable{
	sync s;
	String name;
	Insert(sync s,String name){
		this.s=s;
		this.name=name;
		new Thread(this,"StackInsert").start();
	}
	public void run(){
		while(true){
		s.push(name);
		}
	}
}
class Ass1_5{
	public static void main(String args[]){
		sync s=new sync();
		Insert i=new Insert(s,"StackInsert");
		Delete d=new Delete(s,"StackDelete");
	}
}