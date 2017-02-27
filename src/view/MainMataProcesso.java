package view;

import javax.swing.JOptionPane;

import controller.MataProcesso;

public class MainMataProcesso 
{

	public static void main(String[] args) 
	{
		MataProcesso mp=new MataProcesso();
		
		String so=System.getProperty("os.name");
		
		
	//	System.out.println(so+" "+System.getProperty("os.version"));
		
		//String caminho="c:\\windows\\notepad.exe";
		//mp.iniciaProcesso(caminho);
		
		String processo=JOptionPane.showInputDialog("insira  o número ou nemo do processo");
		
		mp.reconheceSis(so);
		mp.mataPid(so, processo);
		
		

	}

}
