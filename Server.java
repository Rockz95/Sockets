// The skeleton program for Server
import java.net.*;
import java.io.*;

public class Server
{
	//Input Stream
    private Socket socket = null;
	private ServerSocket server = null;
    private DataInputStream in = null;
    
    public server(int port){
        try{
            server =  new ServerSocket(port );
            system.out.println("Server started");
            System.out.println("Waiting for a client to connect....");

            socket = server.accept();
            system.out.println("Client connection accepted");
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";
            while (!line.equals("Done")) {
                try {
                    line = in.readUTF();
                    system.out.println(line);
                } catch (IOException i) {
                    System.out.println(i);    
                }
            }
            Socket.close();
            in.close();
        }
    }
}

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }

