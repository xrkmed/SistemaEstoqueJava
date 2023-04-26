package Interfaces;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import Database.Produtos;

public interface EstoqueInterface {

	public void addProduto(Produtos prod, Integer quantity); // adicionar o produto na lista de estoques
	public Produtos addEstoque(Produtos product, Integer quantity); // incrementar a quantidade no estoque de algum produto
	public boolean updateEstoque(int produtoId, BiFunction<? super Produtos, ? super Integer, ? extends Integer> bifunc); // sistema interno e/ou database
	public List<Produtos> getProdutos(BiPredicate<? super Produtos, ? super Integer> predicate); // retornar lista de produtos que satisfacam o Predicado Duplo
	public Integer getQuantity(Produtos product); // retorna a quantidade de estoque de um determinado produto
	public void imprimirResumoEstoque(); // retorna todos os produtos em estoque e suas respectivas quantidades
	
	
}
