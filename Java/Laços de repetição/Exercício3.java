
import java.util.Scanner;

public class Exercício3 {
	
	public static void main(String args[]) {
		
		int idade= 0, pessoas21= 0, pessoas50= 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade!= -99) 
		{
			System.out.println("Insira uma idade:");
			idade = leia.nextInt();
			
			if(idade< 21) 
			{
				pessoas21++;
			}
			else if(idade> 50) 
			{
				pessoas50++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos é:"+ pessoas21);
		System.out.println("Total de pessoas com mais de 50 anos é:"+ pessoas50);
	}
}

