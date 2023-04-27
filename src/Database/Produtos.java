package Database;

import java.util.ArrayList;
import java.util.Objects;

import Interfaces.ProdutosInterface;

public class Produtos implements ProdutosInterface {

	public static int globalId = 1;
	
	private int id;
	private String nome;
	private double price;
	private ArrayList<Categoria> categories = new ArrayList<>();
	
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
		this.nome = nome;
		this.price = price;
	}
	
	public Produtos(int id, String nome, double price, Categoria mainCategory) {
		this.id = id;
		this.nome = nome;
		this.price = price;
		categories.add(mainCategory);
	}
	
	public boolean hasCategoriaId(int id){
		for(Categoria c : categories){
			if(c.getId() == id){
				return true;
			}
		}
		
		return false;
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
