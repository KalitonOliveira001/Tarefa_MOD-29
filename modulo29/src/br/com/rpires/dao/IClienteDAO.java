//package br.com.rpires.dao;

//import br.com.rpires.domain.Cliente;
//import java.util.Collection;

//public interface IClienteDAO {
  //  public Boolean cadastrar(Cliente cliente);
    //public Cliente consultar(Long cpf);
    //public Boolean excluir(Long cpf);
    //public Collection<Cliente> buscarTodos();
    //public Boolean atualizar(Cliente cliente);
//}
package br.com.rpires.dao;

import br.com.rpires.domain.Cliente;
import java.util.Collection;

public interface IClienteDAO {
    Boolean cadastrar(Cliente cliente);
    Cliente consultar(Long id);
    Boolean atualizar(Cliente cliente);
    Boolean excluir(Long id);
    Collection<Cliente> buscarTodos();
}