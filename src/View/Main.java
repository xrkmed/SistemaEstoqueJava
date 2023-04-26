package View;

import Database.Estoque;
import Database.Produtos;

public class Main {

	public static void main(String[] args) {
		Estoque estoqueClass = new Estoque();
		estoqueClass.addProduto(new Produtos(1, "Pao", 10, 0.5), 1);
		
		System.out.println("Quantidade antes de ser adicionado: " + estoqueClass.getQuantity(new Produtos(1)));
		
		estoqueClass.addEstoque(new Produtos(1), 6);
		System.out.println("Quantidade depois de ser adicionado: " + estoqueClass.getQuantity(new Produtos(1)));	
		
		estoqueClass.updateEstoque(1, (Produtos p, Integer quantity) -> {
		quantity -= 2;
		return quantity;
		});
		
		estoqueClass.imprimirResumoEstoque();
		estoqueClass.toString();
		
		System.out.println(estoqueClass.getProdutos((Produtos produto, Integer quantidade) -> {
			if(quantidade > 2 || produto.getId() == 1) {
				return true;
			}
			
			return false;
		}).size());
		
		return;
	}
}
