package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import model.Busca;

public class BuscaController implements ActionListener
{
	
	private JTextField txtBusca;
	private JButton btnBusca;
	private JButton	btnOk;
	private JButton btnCancelar;
	
	public BuscaController(JTextField txtBusca,JButton btnBusca,JButton	btnOk,JButton btnCancelar)
	{
		this.btnBusca=btnBusca;
		this.btnCancelar=btnCancelar;
		this.btnOk=btnOk;
		this.txtBusca=txtBusca;
		
	}
	
	public void buscaArquivo()
	{
		
		//Busca b =new Busca();
		FileNameExtensionFilter filtro =new FileNameExtensionFilter("arquivos executaveis (.exe)", "exe");
		String diretorioBase =System.getProperty("user.home")+ "/Desktop";
		File dir=new  File(diretorioBase);
		
		
		JFileChooser choose =new JFileChooser();
		choose.setCurrentDirectory(dir);
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choose.setAcceptAllFileFilterUsed(false);
		choose.addChoosableFileFilter(filtro);
		String caminhoArquivo="";
		
		int retorno = choose.showOpenDialog(null);
		
		if(retorno== JFileChooser.APPROVE_OPTION)
		{
			caminhoArquivo=choose.getSelectedFile().getAbsolutePath();
			txtBusca.setText(caminhoArquivo);
		}
		
		
		
		
	}

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		 buscaArquivo();
		
	}
	
	
	

}
