package controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class RedesController 
{

	public RedesController()
	{
		super();
	}
	
	public void ip(String so) throws UnknownHostException
	{
		Enumeration nis = null;
		try 
		{
			nis = NetworkInterface.getNetworkInterfaces();	
		}
		catch (SocketException e) {
			e.printStackTrace();
		}  
		while (nis.hasMoreElements()) {  
			NetworkInterface ni = (NetworkInterface) nis.nextElement();  
			Enumeration ias = ni.getInetAddresses();  
			while (ias.hasMoreElements()) {  
				InetAddress ia = (InetAddress) ias.nextElement();  
				System.out.println(ni.getName() +" ip: "  + ia.getHostAddress() + "    hostname:"  + ia.getHostName());   
			}  
		}
		
		
	}
	
	public void ping(String os)
	{
		String site= " ping -t www.google.com.br";
		try
		{
			Runtime.getRuntime().exec(site);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
