package Exerc�cio1;

import java.util.Scanner;

public class Exerc�cio1 {
	public static void main (String args[])
	{
		
		int numa, numb, numc, maiornum= 0;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro n�mero:");
		numa= leia.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		numb= leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		numc= leia.nextInt();
		
		if (numa> numb) {
			maiornum= numa;
		}
		else 
		{
			maiornum= numb;
		}
		if (numc> maiornum) 
		{
			maiornum= numc;
		}
		System.out.println("Maior n�mero:"+ maiornum);
		
	}

}










	