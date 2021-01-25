import java.util.*;
class MyException extends Exception { 
    public MyException(String s) 
    {
        super(s);
    } 
} 
class Student{
    String name;
    int age;
    String Address;
    Scanner sc;
    Student(){
        try{
            sc = new Scanner(System.in);
            System.out.println("Enter Your Name : ");
            name = sc.nextLine();
            System.out.println("Enter Your age : ");
            age = sc.nextInt();
            if(age < 18)
                throw new MyException("Invalid age Exception !!!"); 
            sc.nextLine();
            System.out.println("Enter Your Address(Only city) : ");
            Address = sc.nextLine();
            display();
        }
        catch(MyException e){ 
            System.out.println("-------------------------------");
            System.out.println("Invalid age Exception !!!");
            System.out.println("-------------------------------");
        }
    }
    void display(){
        System.out.println("-------------------------------");
        System.out.println("Registration successfully done");
        System.out.println("-------------------------------");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Address : "+ Address);
        System.out.println("-----------------");
    }
}
class test{
    public static void main(String[] args){
        new Student();
    }
}