import javax.swing.JOptionPane;

public class ExemploArrayMultiDimensional
{
	public static void main(String[] args)
	{
		String nomes[][], listaNomes = "", listaSobrenomes= "";
		int totalNomes=0;
	
		totalNomes = Integer.parseInt(JOptionPane.showInputDialog(null, "Total de Nomes"));
		nomes = new String[totalNomes][2];

		for(int linha = 0; linha < nomes.length; linha++)
		{
			nomes[linha][0] = JOptionPane.showInputDialog(null, "Entre com o nome ["+ (linha+1) + "]");
			nomes[linha][1] = JOptionPane.showInputDialog(null,"Entre com o sobrenome ["+ (linha+1) +"]");
			listaNomes+= nomes[linha][0]+ "\n";
			listaSobrenomes+= nomes[linha][1]+ "\n";
		}	
	System.out.println(listaNomes);
	System.out.println(listaSobrenomes);
	System.exit(0);
	}
}
