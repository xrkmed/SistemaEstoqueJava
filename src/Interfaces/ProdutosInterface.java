package Interfaces;

import java.util.function.BiPredicate;

public interface ProdutosInterface {

	//Classe interface obrigando a interpretacao dos metodos abaixos para a funcionalidade do sistema e algum feature no futuro de implementacoes de funcoes com argumentos da interface
	public double getTotalValue(); // retornar total de valor dos produtos levando em consideracao suas quantidades
	public int getId(); // retornar o Id
	
}
