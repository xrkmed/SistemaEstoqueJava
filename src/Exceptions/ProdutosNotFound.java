package Exceptions;

public class ProdutosNotFound extends RuntimeException {
	
	public ProdutosNotFound() {
		super("O produto nao foi encontrado em nosso banco de dados.");
	}
	
	public ProdutosNotFound(String msg) {
		super(msg);
	}

}
