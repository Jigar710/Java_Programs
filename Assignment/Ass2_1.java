class sync{
    volatile int n[]=new int[15];
    boolean setvalue=false;
	volatile int p=0;
	String name;
	
    synchronized void push(String name) {
		this.name=name;
		if(name.equals("StackInsert")){	
			while(setvalue){
				try {
					wait();
				}
				catch (InterruptedException e){
					System.out.println("Interrupted exception caught !!!");
				}
			}
			for(int i=p;i<15;i++){
				this.n[i]=i+1;
				System.out.println("push: "+n[i]);
				p++;
			}
			setvalue=true;
			System.out.println("Stack is full");
			notify();
		}
    }

    synchronized void pop(String name){
		this.name=name;
		if(name.equals("StackDelete")){	
			while(!setvalue){
				try{
					wait();
				}
				catch(InterruptedException e) {
					System.out.println("Interrupted exception caught !!!");
				}
			}
			for(int i=p-1;i>=0;i--){
				System.out.println("pop: " + n[i]);
				p--;
			}
			setvalue=false;
			System.out.println("Stack is empty");
			notify();
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
class Ass2_1{
    public static void main(String args[]){
		sync s=new sync();
		
        Insert i=new Insert(s,"StackInsert");
        Delete d=new Delete(s,"StackDelete");

    }
}