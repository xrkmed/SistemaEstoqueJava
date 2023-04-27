package Database;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CategoriasDAO {
    public static final ArrayList<Categoria> categorias = new ArrayList<>();


    //Singleton class to ensure only one instance of this class is created
    public static CategoriasDAO instance = null;

    public static CategoriasDAO getInstance(){
        if(instance == null){
            instance = new CategoriasDAO();
        }

        return instance;
    }

    public Categoria addCategoria(String nome, String descricao){
        Categoria c = new Categoria(nome, descricao);
        categorias.add(c);

        return c;
    }

    public void addCategoria(Categoria e){
        categorias.add(e);
    }

    public Categoria findCategoriaByName(String name){
        for(Categoria c : categorias){
            if(c.getNome().equals(name)){
                return c;
            }
        }

        return null;
    }


    public Categoria findCategoriaById(int id){
        for(Categoria c : categorias){
            if(c.getId() == id){
                return c;
            }
        }

        return null;
    }

    public List<Categoria> searchCategoria(String termo){
        List<Categoria> result = categorias.stream().filter(category -> {
            if(category.getDescricao().contains(termo) || category.getNome().contains(termo)){
                return true;
            }

            return false;
        }).collect(Collectors.toList());

        return result;
    }

}
