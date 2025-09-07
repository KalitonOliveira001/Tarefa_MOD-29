//package br.com.rpires.dao;

//import br.rpires.domain.Produto;
//import java.util.Collection;

//public interface IProdutoDAO {
    //public Boolean cadastrar(Produto produto);
    //public Produto consultar(Long codigo);
    //public Boolean excluir(Long codigo);
    //public Collection<Produto> buscarTodos();
   // public Boolean atualizar(Produto produto);
//}
package br.com.rpires.dao;

import br.com.rpires.domain.Produto;
import java.util.Collection;

public interface IProdutoDAO {

    Boolean cadastrar(Produto produto);

    Produto consultar(Integer codigo);

    Boolean atualizar(Produto produto);

    Boolean excluir(Integer codigo);

    Collection<Produto> buscarTodos();
}
