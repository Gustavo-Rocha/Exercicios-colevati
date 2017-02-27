package view;

import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) throws UnknownHostException 
	{
		// RedesController r7=new RedesController();
		 
		int cont, opc=0;
		String so=System.getProperty("os.name");

		
		while(opc!=9)
		{
			opc=Integer.parseInt(JOptionPane.showInputDialog("digite uma opção: \n 1-Obter o IP \n 2-Obter o PING"));
			
			switch (opc)
			{
			case 1: RedesController r7=new RedesController();
					r7.ip(so);
			
					
				break;
				
			case 2:
				break;
			
			}
		}
		
		
		

	}

}
