import java.util.*;
class MyEx extends Exception { 
    public MyEx(String s) 
    {
        super(s);
    } 
} 
class Account{
    int amount;
    Scanner sc;
    Account(){
        amount = 0;
        sc = new Scanner(System.in);
    }
    void deposit(){
        System.out.println("Enter Deposit Amount : ");
        amount += sc.nextInt();
        display();
    }
    void withdraw(){
        try{
        System.out.println("Enter Withdraw Amount : ");
        amount -= sc.nextInt();
        if(amount < 0) throw new MyEx("Not Sufficient Fund  !!!");
        display();
        }
        catch(MyEx e){ 
            System.out.println("\n-------------------------------");
            System.out.println(e.getMessage());
            System.out.println("-------------------------------\n");
            System.out.println("Please Retry according your balance...");

        }
    }
    void display(){
        System.out.println("\n-------------------------------");
        System.out.println("Your Bank Balance : "+ amount);
        System.out.println("-------------------------------\n");
    }

}
public class test2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account a1 = new Account();
        a1.display();
        boolean flag = true;
        int choice;
        while(flag){
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Exit");
            System.out.println("Enter Your Choice : ");
            choice = input.nextInt();
            if(choice == 1) a1.deposit();
            else if(choice == 2) a1.withdraw();
            else if(choice == 3) flag = false;
            else
                System.out.println("\nInvalid Choice...Please Retry...!!!\n");
        }
    }
}
