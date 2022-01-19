package com.dio;

public class Emprestimo {
	
	public static double getTaxa(int nParcelas) {
        return (nParcelas * 0.03);
    }
	
	public static double valorTotal(double valor, int nParcelas) {
		if(nParcelas >= 2 && nParcelas <= 9) {
			valor += valor * getTaxa(nParcelas);
		}
		else return 1;
		return valor;
	}
	
	public static double valorParcela(double valor, int nParcelas) {
		return (valorTotal(valor, nParcelas) / nParcelas);
	}
}
