package Interfaces;

import java.util.function.BiPredicate;

public interface ProdutosInterface {

	//Classe interface obrigando a interpretacao dos metodos abaixos para a funcionalidade do sistema e algum feature no futuro de implementacoes de funcoes com argumentos da interface
	public double getTotalValue();
	public int removeQuantidade(int difference);
	public int addQuantidade(int difference);
	public boolean manipularQuantidade(BiPredicate<? super Integer, ? super Integer> query);
	public int getId();
	
}
