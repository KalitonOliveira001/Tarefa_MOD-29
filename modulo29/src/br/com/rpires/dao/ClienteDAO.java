//package br.com.rpires.dao;

//import br.com.rpires.domain.Cliente;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;

//public class ClienteDAO implements IClienteDAO {

   // private Map<Long, Cliente> map;

  //  public ClienteDAO() {
  //      this.map = new HashMap<>();
   // }

   // @Override
    //public Boolean cadastrar(Cliente cliente) {
        //if (map.containsKey(cliente.getCpf())) {
          //  return false;
        //}
        //map.put(cliente.getCpf(), cliente);
      //  return true;
  //  }

 //   @Override
  //  public Cliente consultar(Long cpf) {
    //    return map.get(cpf);
   // }

   // @Override
   // public Boolean excluir(Long cpf) {
      //  Cliente clienteRemovido = map.remove(cpf);
      //  return clienteRemovido != null;
   // }

  //  @Override
    //public Collection<Cliente> buscarTodos() {
    //    return map.values();
   // }

  //  @Override
   // public Boolean atualizar(Cliente cliente) {
      //  Cliente clienteExistente = map.get(cliente.getCpf());
       // if (clienteExistente != null) {
           // map.put(cliente.getCpf(), cliente);
           // return true;
        //}
       // return false;
  //  }
///}
package br.com.rpires.dao;

import br.com.rpires.domain.Cliente;
import java.util.*;

public class ClienteDAO implements IClienteDAO {

    private Map<Long, Cliente> map = new HashMap<>();

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getId())) return false;
        map.put(cliente.getId(), cliente);
        return true;
    }

    @Override
    public Cliente consultar(Long id) {
        return map.get(id);
    }

    @Override
    public Boolean atualizar(Cliente cliente) {
        if (!map.containsKey(cliente.getId())) return false;
        map.put(cliente.getId(), cliente);
        return true;
    }

    @Override
    public Boolean excluir(Long id) {
        return map.remove(id) != null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return map.values();
    }
}

