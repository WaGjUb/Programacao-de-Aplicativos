import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

	public class Buffreader
{
	public static void main(String[] args)
	{
		System.out.printf("Digite algo: ");
		System.out.println(Entrada());
	}
	
	static int Entrada()
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
		int retorno = 0;		
		try
		{
			retorno = Integer.parseInt(input.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Erro de entrada.");
//			return("l");
		}
		return(retorno);
	}
}
