package Exercício3;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String args[]) {
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite a sua idade:");
		idade = leia.nextInt();

		if (idade>=10 && idade<=14){
			System.out.println("A sua categoria é: Infantil");
		}
		else if (idade>=15 && idade<=17){
			System.out.println("A sua categoria é :Juvenil");
		}
		else if (idade>=18 && idade<=25){
			System.out.println("A sua categoria é :Adulto");
		}
		if (idade<=9){
			System.out.println("Você é novo demais para estar em uma categoria.");
		}
		else if (idade>=25){
			System.out.println("Você é velho demais para estar em uma categoria.");
		}

	}

}
