package Database;

import java.util.ArrayList;

public class Categoria {
    
    public static Integer GlobalID = 0;

    private Integer id;  // id da categoria
    private String nome; // nome da categoria
    private String descricao; // descricao da categoria

    public Categoria(String nome, String descricao) { // construtor da categoria
        Categoria.GlobalID++;
        this.id = Categoria.GlobalID;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Categoria() { // construtor vazio da categoria
        Categoria.GlobalID++;
        this.id = Categoria.GlobalID;
    }

    public String getDescricao() { // retorna a descricao da categoria
        return descricao;
    }

    public void updateDescricao(String descricao){ // atualiza a descricao da categoria
        this.descricao = descricao;
    }

    public Integer getId() { // retorna o id da categoria
        return id;
    }

    public String getNome() { // retorna o nome da categoria
        return nome;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nome=" + nome + '}';
    }

}
