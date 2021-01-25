package brod_thread;
import java.io.*;
import java.net.*;
import java.util.*;

class broadcast_server{
    public static void main(String[] args) throws Exception {
        ServerSocket ss= new ServerSocket(30003);
        Socket s[]= new Socket[10] ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message:");
        String msg = sc.nextLine();

        for(int i=0;i<2;i++)
        {
            s[i]=ss.accept();
            OutputStream os = s[i].getOutputStream();
            SenderThread sender = new SenderThread(os,msg);
            sender.start();
        }

        System.out.println("all clients connected");

        
    }
}