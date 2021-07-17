package com.srm.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ServerUDP {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();  
	    String str = "Java DatagramSocket class represents a connection-less socket for sending and receiving datagram packets.\r\n"
	    		+ "\r\n"
	    		+ "A datagram is basically an information but there is no guarantee of its content, arrival or arrival time.";  
	    InetAddress ip = InetAddress.getByName("127.0.0.1");      
	    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
	    ds.send(dp);  
	    ds.close();  
	}

}
