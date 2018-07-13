package javaadv.sockerlearn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream output = null;
	
	public Client(String address, int port)
	{
		try
		{
		socket = new Socket(address,port);
		
		System.out.println("Connected...");
		
		input = new DataInputStream(System.in);
		
		output = new DataOutputStream(socket.getOutputStream());
		
		String line ="";
		
		while(!line.equals("Over"))
		{

			line=input.readLine();
			output.writeUTF(line);
		}
		input.close();
		output.close();
		socket.close();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		Client clinet = new Client("127.0.0.1", 5000);
	}

}
