package View;

import Database.Estoque;
import Database.Produtos;

public class Main {

	public static void main(String[] args) {
		Estoque estoqueClass = new Estoque();
		estoqueClass.addProduto(new Produtos(1, "Pao", 0.5), 1);
		
		System.out.println("Estoque do produto Pao antes de ser adicionado: " + estoqueClass.getQuantity(new Produtos(1)) + ".");
		
		//Os id`s sao unicos, se voce gerar um new Produtos com o id de outro que ja foi gerado, eles se mesclam na classe Estoque.
		estoqueClass.addEstoque(new Produtos(1), 9);
		System.out.println("Estoque do produto Pao depois de ser adicionado: " + estoqueClass.getQuantity(new Produtos(1)) + ".");
		
		estoqueClass.updateEstoque(new Produtos(1), (Produtos p, Integer quantity) -> {
			quantity -= 2;
			return quantity;
		});
		
		System.out.println("Estoque do produto Pao depois de ser removido atraves de outra func: " + estoqueClass.getQuantity(new Produtos(1)) + ".");
		
		estoqueClass.imprimirResumoEstoque();
		estoqueClass.toString();
		
		
		System.out.println("Function para filtrar valores retornou uma lista com " + estoqueClass.getProdutos((Produtos produto, Integer quantidade) -> {
			if(quantidade > 2 || produto.getId() == 1) {
				return true;
			}
			
			return false;
		}).size() + " elemento dentro. (CONDICOES DE FILTRAGEM: (quantidade > 2 || produto.getId() == 1))");
		
		return;
	}
}
