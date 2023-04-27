package Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import Interfaces.EstoqueInterface;

public class Estoque implements EstoqueInterface{
	
	// Produto e estoque disponivel
	private final HashMap<Produtos, Integer> produtosEstoque = new HashMap<>();
	
	public Estoque() {
		
	}
	
	//Adiciona produto no estoque caso nao exista ou acrescenta caso exista
	public void addProduto(Produtos prod, Integer quantity) {
		if(!produtosEstoque.containsKey(prod)) {
			produtosEstoque.put(prod, quantity);
		}else {
			addEstoque(prod, quantity);
		}
	}
	
	
	//Acrescenta produtos no estoque
	public Produtos addEstoque(Produtos product, Integer quantity) {
		produtosEstoque.compute(product, (produto, q) -> {
			if(product.getId() == produto.getId()) {
				q += quantity;	
				return q;
			}
			
			return 0;
		});
		
		return product;
	}
	
	
	//Atualizar o estoque de uma maneira que seja auto implementavel pelo desenvolvedor
	public boolean updateEstoque(Produtos product, BiFunction<? super Produtos, ? super Integer, ? extends Integer> bifunc) {
		produtosEstoque.compute(product, bifunc);
		
		return true;
	}
	
	//Executa uma query definida pelo usuario para retornar uma lista com os produtos que satisfazem o predicado especificado
	public List<Produtos> getProdutos(BiPredicate<? super Produtos, ? super Integer> predicate){
		List<Produtos> result = new ArrayList<>();
		produtosEstoque.forEach((produto, quantidade) -> {
			if(predicate.test(produto, quantidade)) {
				result.add(produto);
			}
		});
		
		return result;
	}
	
	public Integer getQuantity(Produtos product) {
		if(produtosEstoque.containsKey(product)) {
			return produtosEstoque.get(product);
		}
		
		return 0;
	}
	
	public void imprimirResumoEstoque() {
		produtosEstoque.forEach((Produtos p, Integer Estoque) -> {
			System.out.println("\nProduto Id: " + p.getId() +
					" com " + (Estoque == 1 ? "apenas " : "") + Estoque + " estoque " + (Estoque == 1 ? "disponivel" : "disponiveis"));
			
		});
	}
	
	
	@Override
	public String toString() {
		return "Temos ao total de " + produtosEstoque.size() + " tipos diferentes de produtos em estoques.";
	}
}
