package majorapp2;

import java.net.*;
import java.io.*;
public class Majorapp2 {
    public static void main(String[] args) {
        try
        {
          Socket s=new Socket("localhost",2210);
          DataInputStream din=new  DataInputStream(s.getInputStream());
          DataOutputStream dout=new DataOutputStream(s.getOutputStream());
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String s1=br.readLine();
          dout.writeUTF(s1);
          dout.flush();
          System.out.println("server Massage:"+din.readUTF());
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
        
    }    
}
