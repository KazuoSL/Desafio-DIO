package com.dio;

import java.util.Scanner;

public class Main {

	private static Scanner ler;

	public static void main(String[] args) {
		ler = new  Scanner(System.in);
		
		double n1, n2, valor;
		int hora, parcelas; 
		
		System.out.println("--------Calculadora-------");
		System.out.println("Digitar 2 numeros: ");
		n1 = ler.nextDouble();
		n2 = ler.nextDouble();
		
		System.out.println("A soma dos numeros é: " + Calculadora.soma(n1, n2));
		System.out.println("A subtracao dos numeros é: " + Calculadora.subtracao(n1, n2));
		System.out.println("A multiplicacao dos numeros é: " + Calculadora.multiplicacao(n1, n2));
		System.out.println("A divisao dos numeros é: " + Calculadora.divisao(n1, n2));
		
		System.out.println();
		System.out.println("--------Mensagem-------");
		System.out.println("Digite o horario: ");
		hora = ler.nextInt();
		Mensagem.mensagem(hora);
		
		System.out.println();
		System.out.println("--------Emprestimo-------");
		System.out.println("Digitar valor: ");
		valor = ler.nextDouble();
		System.out.println("Digitar numero de parcelas: ");
		parcelas = ler.nextInt();
		if(Emprestimo.valorTotal(valor, parcelas) == 1)
			System.out.println("Parcelas Inválidas!");			
		else {
			System.out.println("Valor Total: " + Emprestimo.valorTotal(valor, parcelas));
			System.out.println("Valor de cada parcela: " + Emprestimo.valorParcela(valor, parcelas));
		}
	}
}
