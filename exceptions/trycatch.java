public class trycatch
{
	public static void main(String[] args)
	{
		System.out.println("Resultado de 2/3: " + div(2,0));
	}
	
	public static int div(int a, int b)
	{
		try {
		return((int) a / b);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	
		return(0);
	}
}
