import javax.swing.JOptionPane;

public class Exercicio_Dialogos
{
	public static void main(String[] args)
	{
		String nome = JOptionPane.showInputDialog(null,"Digite o seu nome completo:", "Nome completo", JOptionPane.QUESTION_MESSAGE);
		String curso = JOptionPane.showInputDialog(null,"Digite o nome do seu curso:", "Nome do curso", JOptionPane.QUESTION_MESSAGE);
		int periodo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu periodo:", "Periodo", JOptionPane.QUESTION_MESSAGE));
	
		JOptionPane.showMessageDialog(null,"\nNome completo: " + nome + "\nCurso: " + curso + "\nPeriodo: " + periodo, "Informações", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}
}
