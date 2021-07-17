package com.srm.net;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientTCP {

	public static void main(String[] args) {
		try
		{
			Socket s=new Socket("localhost", 6666);
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			out.writeUTF("Sending data from Client to Server");
			out.flush();
			out.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
