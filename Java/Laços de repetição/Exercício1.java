public class Exercício1 {

	public static void main(String args[]) {
		
		int x;
		
		System.out.println("Resultado de 1000 a 1999 que divididos por 11 obtemos resto= 5:");

		for (x= 1000; x <= 1999; x++)
		{
		    if (x% 11== 5) 
		    {
		        System.out.println(x);
			}
		}
	}

}