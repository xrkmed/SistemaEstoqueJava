package Interfaces;

import java.util.function.BiPredicate;

public interface ProdutosInterface {

	//Classe interface obrigando a interpretacao dos metodos abaixos para a funcionalidade do sistema e algum feature no futuro de implementacoes de funcoes com argumentos da interface
	public double getTotalValue(); // retornar total de valor dos produtos levando em consideracao suas quantidades
	public int removeQuantidade(int difference); // remover quantidade de algum produto
	public int addQuantidade(int difference); // adicionar quantidade de algum produto
	public boolean manipularQuantidade(BiPredicate<? super Integer, ? super Integer> query); // fazer uma function com BiPredicate para utilizar futuramente em algum banco de dados ou sistema interno
	public int getId(); // retornar o Id
	
}
