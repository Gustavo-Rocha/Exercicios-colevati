package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MataProcesso 
{
	
	public MataProcesso()
	{
		super();
	}
	
	//public String so()
	//{
		//String so=System.getProperty("os.name");
		 
		// return  so;	
	//}

	public void iniciaProcesso(String caminho)
	{
		
		try 
		{
			Runtime.getRuntime().exec(caminho);
			
		} 
		catch (IOException e) 
		{
		
			e.printStackTrace();
		}
	}
	
	public  void reconheceSis(String so)
	{
		String comando="";
		
		if(so=="Linux")
		{
			comando=" ps aux";
			try 
			{
				Process proc=Runtime.getRuntime().exec(comando);
				InputStream fluxo=proc.getInputStream();
				InputStreamReader leitor=new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha= buffer.readLine();
				
				while(linha!= null)
				{
					System.out.println(linha);
					linha= buffer.readLine();
				}
				
			} catch (IOException e) 
			{
			
				e.printStackTrace();
			}
		}
		
		else
		{
			comando= "TASKLIST /FO TABLE";
			
			try 
			{
				Process proc=Runtime.getRuntime().exec(comando);
				InputStream fluxo=proc.getInputStream();
				InputStreamReader leitor=new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha= buffer.readLine();
				
				while(linha!= null)
				{
					System.out.println(linha);
					linha= buffer.readLine();
				}
				
			} catch (IOException e) 
			{
			
				e.printStackTrace();
			}
			
		}
	}
	
	
	public void mataPid(String so,String comando)
	{
		String cmdPid = "TASKKILL /PID ";
		String cmdNome= "TASKKILL /IM ";
		int pid=0;
		StringBuffer buffer= new StringBuffer();
		
		if(so=="windows")
		{
		
		try
		{
			pid=Integer.parseInt(comando);
			buffer.append(cmdPid);
			buffer.append(pid);
			
		}
		
		catch(NumberFormatException e)
		
		{
			buffer.append(cmdNome);
			buffer.append(comando);
		}
		
		iniciaProcesso(buffer.toString());
		
		}
		
		else
		{
			String cmdPidL = "KILL /PID ";
			int pidL=0;
			 try
			 {
				 pid=Integer.parseInt(comando);
				 buffer.append(cmdPidL);
				 buffer.append(pidL);
			 }
			 
			 catch(NumberFormatException e)
				
				{
					buffer.append(cmdNome);
					buffer.append(comando);
				}
				
				iniciaProcesso(buffer.toString());
			
			
		}
		
	}

}
