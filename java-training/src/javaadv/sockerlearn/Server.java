package javaadv.sockerlearn;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream in = null;
	
	public Server(int port)
	{
		try {
			server = new ServerSocket(port);
			System.out.println("Server started ....");
			
			System.out.println("Waiting for client...");
			
			socket = server.accept();
			System.out.println("Client connected....");
			
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			
			String line = "";
			while(!line.equals("Over"))
			{
				line =in.readUTF();
				System.out.println(line);
			}
			System.out.println("Server shutting down...");
			socket.close();
			in.close();
					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server(5000);
	}
	
}
