package Server_Side;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author descifrado
 */
public class Server 
{
    public static ServerSocket server;
    public static final int port=8806;
    public static void main(String args[]) throws IOException
    {
        server=new ServerSocket(port);
        while(true)
        {
            Socket client=null;
            try
            {
                System.out.println("Waiting For Clients To Connect: ");
                client=server.accept();
                System.out.println("A new Client Connected: "+client);
                Thread t=new Thread(new ClientHandler(client)); 
                t.start(); 
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
