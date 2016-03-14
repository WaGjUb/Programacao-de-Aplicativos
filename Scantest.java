import java.util.Scanner;

public class Scantest
{
	public static void main(String[] args)
	{
		System.out.print("Digite algo: ");
		System.out.println(Entrada());
		
	}
	
	static String Entrada()
	{
		Scanner digitado = new Scanner(System.in);
		String digit = digitado.next();
		return(digit);
	}
}
