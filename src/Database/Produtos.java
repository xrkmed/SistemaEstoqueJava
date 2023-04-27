package Database;

import java.util.Objects;
import java.util.function.BiPredicate;

import Interfaces.ProdutosInterface;

public class Produtos implements ProdutosInterface {

	public static int globalId = 1;
	
	private int id;
	private String nome;
	private double price;
	
	public Produtos() {
		this.id = Produtos.globalId;
		Produtos.globalId++;
	}
	
	//Construtor de item virtual apenas para comparacoes com o metodo override equals
	public Produtos(int id) {
		this.id = id;
		this.nome = "Virtual Item";
		this.price = 1;
	}
	
	public Produtos(String nome, double price) {
		this();
		this.price = price;
	}
	
	public Produtos(int id, String nome, double price) {
		this.id = id;
		this.price = price;
	}
	
	public double getTotalValue() { 
		return this.price;
	};
	
	public String getNome(){
		return nome;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return id == other.id;
	}
	
	
}
