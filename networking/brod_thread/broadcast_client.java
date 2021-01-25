package brod_thread;
import java.io.*;
import java.net.*;
import java.util.*;

class broadcast_client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1",30003);

     
        InputStream is = s.getInputStream();
        
        RecThread rec = new RecThread(is);
        rec.start();
    }
}
