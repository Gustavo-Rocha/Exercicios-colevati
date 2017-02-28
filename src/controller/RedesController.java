package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		String winIp= "ipconfig /all";
		String linIp="ip addr show";
		
		if(so.startsWith("W"))
		{
			try
			{
			
				Process proc= Runtime.getRuntime().exec(winIp);
				InputStream fluxo = proc.getInputStream();
				InputStreamReader leitor =new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha=buffer.readLine();
				
				while(linha != null)
				{
					if(linha.contains("IPv4"))
					{
						System.out.println(linha.toString());
						
					}
					else if(linha.contains("Descri"))
					{
						System.out.println(linha.toString());
					}
					
					linha=buffer.readLine();
					
				}
				
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		}
		
		else if(so.startsWith("L"))
		{
			try
			{
				Process proc =Runtime.getRuntime().exec(linIp);
				InputStream fluxo= proc.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer =new BufferedReader(leitor);
				String linha=buffer.readLine();
				
				while(linha !=null)
				{
					if(linha.contains("IPv4"))
					{
						System.out.println(linha.toString());
					}
					
					else if(linha.contains("Descri"))
					{
						System.out.println(linha.toString());
					}
					
					linha=buffer.readLine();
				}
						
			}
			
			catch( IOException e)
			{
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	public void ping(String os)
	{
		String wPing= " ping www.google.com.br -n 10 ";
		String lPing="ping www.google.com.br -c 10";
		
		if(os.startsWith("W"))
		{
			try
			{
				Process proc =Runtime.getRuntime().exec(wPing);
				InputStream fluxo = proc.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				//String fil[]=linha.split("");
				//System.out.println(linha);
				
				
				while(linha !=null)
				{
					if(linha.trim().contains("M¡nimo "))
					{
						System.out.println(linha.toString());
					}		
					else
					{
						System.out.println(linha.toString());
					}
					
					linha=buffer.readLine();
				}
			}
			
			catch( IOException e)
			{
				e.printStackTrace();
			}
			
		}
		else if(os.startsWith("L"))
		{
			
			try {
				Process proc = Runtime.getRuntime().exec(lPing);
				InputStream fluxo = proc.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer =new BufferedReader (leitor);
				String linha= buffer.readLine();
				//String fil[]=linha.split("");
				//System.out.println(fil[2]);
				
				
				while(linha !=null)
				{
					if(linha.contains("M¡nimo"))
					{
						System.out.println(linha.toString());
					}
					
					else if(linha.contains("Milissegundos"))
					{
						System.out.println(linha.toString());
					}
					
					linha=buffer.readLine();
				}
						
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
	
	
}
