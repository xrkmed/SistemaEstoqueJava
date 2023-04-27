package Database;

import java.util.Objects;
import java.util.function.BiPredicate;

import Interfaces.ProdutosInterface;

public class Produtos implements ProdutosInterface {

	public static int globalId = 1;
	
	private int id;
	private String nome;
	private int quantidade;
	private double price;
	
	public Produtos() {
		this.id = Produtos.globalId;
		Produtos.globalId++;
	}
	
	//Construtor de item virtual apenas para comparacoes com o metodo override equals
	public Produtos(int id) {
		this.id = id;
		this.nome = "Virtual Item";
		this.quantidade = 1;
		this.price = 1;
	}
	
	public Produtos(String nome, int quantidade, double price) {
		this();
		this.quantidade = quantidade;
		this.price = price;
	}
	
	public Produtos(int id, String nome, int quantidade, double price) {
		this.id = id;
		this.quantidade = quantidade;
		this.price = price;
	}
	
	public double getTotalValue() { 
		return Math.max(this.price*this.quantidade, 1);
	};
	
	public int removeQuantidade(int difference) {
		quantidade -= Math.max(difference, 0);
		
		return quantidade;
	}
	
	public int addQuantidade(int difference) {
		if(difference < 1) {
			return removeQuantidade(difference);
		}
		
		quantidade += difference;
		return quantidade;
	}

	public String getNome(){
		return nome;
	}
	
	//Apenas para usos da classe database
	public boolean manipularQuantidade(BiPredicate<? super Integer, ? super Integer> query) {
		if(query.test(this.id, this.quantidade)) {
			return true;
		}
		
		return false;
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
