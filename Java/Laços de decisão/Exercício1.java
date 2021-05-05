package Exercício1;

import java.util.Scanner;

public class Exercício1 {
	public static void main (String args[])
	{
		
		int numa, numb, numc, maiornum= 0;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro número:");
		numa= leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		numb= leia.nextInt();
		
		System.out.println("Digite o terceiro número:");
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
		System.out.println("Maior número:"+ maiornum);
		
	}

}










	