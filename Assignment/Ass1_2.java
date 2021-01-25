class Time{
	int hour,minute,second;
	Time(int h,int m,int s){
		hour=h;
		minute=m;
		second=s;
	}
	Time(){
	}
	Time sum(Time t){
		Time ans=new Time();
		ans.hour=this.hour+t.hour;
		ans.minute=this.minute+t.minute;
		ans.second=this.second+t.second;
		return ans;
	}
	public String toString(Time t){
		return String.format("%02d:%02d:%02d",t.hour,t.minute,t.second);
	}
}
class Ass1_2{
	public static void main(String args[]){
		Time t1=new Time(2,20,37);
		Time t2=new Time(4,3,17);
		Time t3;
		t3=t1.sum(t2);
		System.out.println("Sum of two times: ("+t3.toString(t3)+")");
	}
}