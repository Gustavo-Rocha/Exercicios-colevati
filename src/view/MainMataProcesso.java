package view;

import javax.swing.JOptionPane;

import controller.MataProcesso;
import controller.RedesController;

public class MainMataProcesso 
{

	public static void main(String[] args) 
	{
		
		
		MataProcesso mp=new MataProcesso();
		
		String so=System.getProperty("os.name");
		
		
	//	System.out.println(so+" "+System.getProperty("os.version"));
		
		//String caminho="c:\\windows\\notepad.exe";
		//mp.iniciaProcesso(caminho);
		mp.reconheceSis(so);
		
		String processo;
		int opc = 0;
		
		while( opc!=9)
		{
			 opc=Integer.parseInt(JOptionPane.showInputDialog(" 1- para o número \n 2- para o nome do processo \n 9- finalizar"));

			switch (opc)
			{
			case 1: processo=JOptionPane.showInputDialog("insira o número do processo");
					mp.mataPid(so,processo);
			
					
				break;
				
			case 2:	processo=JOptionPane.showInputDialog("insira o nome do processo");
				
					mp.mataPNome(so, processo);
					
				break;
				
				
			case 9: System.exit(0);
				break;
			}
		}
		//String processo=JOptionPane.showInputDialog("insira  o número ou nome do processo");
		
		
		
		
		

	}

}
