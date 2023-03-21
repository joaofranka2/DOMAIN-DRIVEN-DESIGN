package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
	// aumentar o valor do carro 10% 0.1	
	void atualizarValor(double porcentagem) {	
		valor *= (1 + porcentagem);	
	}
			
	//Criar um metodo que calcular e retorna o valor do seguro do carro
    //Seguro do carro eh baseado no valor, 5% do valor do carro
	double caulcularSeguro() {	
		double seguro = valor * 0.05;
		return seguro;
		
	}
	
		
	//Criar um metodo que recebe a quantidade de parcelas, calcula e retorna	
	//o valor da parcela do seguro	
			
	double calcularvalorparcelasseguro(int parcelas) {
	double parcela = valor * 0.05 / parcelas;
		return parcela;
		
	}
		
		
	
} 	
    