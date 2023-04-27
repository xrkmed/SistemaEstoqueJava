
# Sistema de Controle de Estoque

Um sistema de controle de estoque de produtos tem como finalidade principal gerenciar a quantidade de produtos disponíveis em um determinado local, permitindo que as empresas controlem as entradas e saídas de produtos de forma eficiente e precisa.

Esse tipo de sistema ajuda as empresas a manterem um controle detalhado de seus estoques, permitindo que elas tomem decisões mais precisas sobre a compra, venda e armazenamento de produtos. O sistema permite que as empresas monitorem a disponibilidade dos produtos em tempo real, evitando que eles fiquem esgotados ou em excesso.

Com um sistema de controle de estoque, as empresas podem monitorar de forma eficiente os níveis de estoque, programar a reposição de produtos antes que os mesmos acabem, minimizar perdas e garantir um fluxo de caixa saudável.

Além disso, um sistema de controle de estoque pode ajudar as empresas a prever as tendências de demanda futura, permitindo que elas planejem suas compras com antecedência e evitem problemas de excesso ou falta de produtos. O sistema também pode ajudar a reduzir o tempo e o custo envolvidos na contagem física do estoque, além de melhorar a precisão e a eficiência dos processos de atendimento ao cliente.

## Autores

- [@xrkmed](https://www.github.com/xrkmed)


## Funcionalidades


- Adição de produtos: permitir que o usuário adicione novos produtos ao sistema, incluindo informações como nome do produto, descrição, preço e quantidade disponível em estoque.

- Controle de estoque: permitir que o usuário visualize o nível atual de estoque de cada produto, a quantidade mínima e máxima permitida para cada produto e definir alertas de baixo estoque para que o usuário seja notificado quando a quantidade de um produto atingir um determinado nível.

- Registro de movimentações: permitir que o usuário registre a entrada e saída de produtos do estoque, incluindo informações como a data, o tipo de movimentação (compra, venda, devolução etc.) e a quantidade de produtos envolvidos.

- Relatórios: permitir que o usuário gere relatórios sobre o estoque, como um relatório de vendas por produto ou um relatório de movimentações do estoque em um determinado período de tempo. Isso pode ajudar o usuário a tomar decisões estratégicas com base nas informações coletadas pelo sistema.

## Uso/Testes

```
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
```
