package com.srm.net;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss=new ServerSocket(6666);
			Socket sk=ss.accept();
			DataInputStream inp=new DataInputStream(sk.getInputStream());
			String data=(String)inp.readUTF();
			System.out.println("Message on Server Side : "+data);
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
