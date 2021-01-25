import java.util.Scanner;
class car{
	String model_no,car_name,color;
	Scanner in= new Scanner(System.in);
	void getCarDetails(){
		System.out.println("Enter car model no:");
		model_no=in.nextLine();
		System.out.println("Enter the car name:");
		car_name=in.nextLine();
		System.out.println("Enter the car color:");
		color=in.nextLine();
	}
	void showCarDetails(){
		System.out.println("Model no: "+model_no+"\nCar name: "+car_name+"\nCar color: "+color);
	}
}
class Ass1_1{
	public static void main(String args[]){
		car c[]=new car[3];
		for(int i=0;i<3;i++){
			c[i]=new car();
			c[i].getCarDetails();
		}
		for(int i=0;i<3;i++){
			c[i].showCarDetails();
		}
	}
}