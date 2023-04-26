package Exceptions;

public class InvalidQuantity extends RuntimeException {
	
	public InvalidQuantity(String msg) {
		super(msg);
	}
	
	public InvalidQuantity() {
		super("O Argumento inserido nao pode ser menor que um.");
	}

}
