import javax.swing.JOptionPane;

public class Dialogos
{
	public static void main(String[] args)
	{
		painel1(); //mensagem
		painel2(); //confirmacao
		painel3(); //entrada
	}
	
	static void painel1()
	{
		JOptionPane.showMessageDialog(null, "Mensagem", "titulo 1", JOptionPane.ERROR_MESSAGE); 
	//	System.exit(0);
	}
	
	static void painel2()
	{
		JOptionPane.showConfirmDialog(null,"Confirmacao", "titulo 2", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	//	System.exit(0);
	}

	static void painel3()
	{
		JOptionPane.showInputDialog(null,"Entrada", "titulo 3", JOptionPane.QUESTION_MESSAGE);
		System.exit(0);
	}
	
}
