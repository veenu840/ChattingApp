package majorapp1;
import java.io.*;
import java.net.*;
public class Majorapp1 
{
    public static void main(String[] args) {
       try
       {
           ServerSocket ss=new ServerSocket(2210);
           Socket s=ss.accept();
           DataInputStream din =new DataInputStream(s.getInputStream());
           DataOutputStream dout =new DataOutputStream(s.getOutputStream());
           System.out.println("Client massage:" +din.readUTF());
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter a line");
           String s2=br.readLine();
           dout.writeUTF(s2);
           dout.flush();
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
    }
    
}
