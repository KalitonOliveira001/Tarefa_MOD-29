//package br.com.rpires.dao;

//import br.rpires.domain.Produto;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;

//public class ProdutoDAO implements IProdutoDAO {

   // private Map<Long, Produto> map;

 //   public ProdutoDAO() {
     //   this.map = new HashMap<>();
 //   }

   // @Override
   // public Boolean cadastrar(Produto produto) {
      //  if (map.containsKey(produto.getCodigo())) {
      //      return false;
       // }
        //map.put(produto.getCodigo(), produto);
      //  return true;
  //  }

   // @Override
 //   public Produto consultar(Long codigo) {
       // return map.get(codigo);
   // }

  //  @Override
 //   public Boolean excluir(Long codigo) {
   //     Produto produtoRemovido = map.remove(codigo);
     //   return produtoRemovido != null;
   // }

  //  @Override
   // public Collection<Produto> buscarTodos() {
        //return map.values();
   // }

  //  @Override
    //public Boolean atualizar(Produto produto) {
      //  Produto produtoExistente = map.get(produto.getCodigo());
      //  if (produtoExistente != null) {
        //    map.put(produto.getCodigo(), produto);
         //   return true;
  //      }
    //    return false;
 //   }
//}
//package br.com.rpires.dao;

//import br.com.rpires.domain.Produto;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;

//public class ProdutoDAO implements IProdutoDAO {

    //private Map<Integer, Produto> map = new HashMap<>();

    //@Override
    //public Boolean cadastrar(Produto produto) {
    //    if (map.containsKey(produto.getCodigo())) {
    //        return false;
        //}
      //  map.put(produto.getCodigo(), produto);
    //    return true;
    //}

    //@Override
   // public Produto consultar(Integer codigo) {
     //   return map.get(codigo);
    //}

   //// @Override
    //public Boolean atualizar(Produto produto) {
        //if (!map.containsKey(produto.getCodigo())) {
        //   return false;
        //}
       // map.put(produto.getCodigo(), produto);
     //   return true;
    //}

   //@Override
    ///public Boolean excluir(Integer codigo) {
      ///  return map.remove(codigo) != null;
    ///}

    ///@Override
    ///public Collection<Produto> buscarTodos() {
    //    return map.values();
  //  }
//}
package br.com.rpires.dao;

import br.com.rpires.domain.Produto;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO implements IProdutoDAO {

    private Map<Integer, Produto> map = new HashMap<>();

    @Override
    public Boolean cadastrar(Produto produto) {
        if (map.containsKey(produto.getCodigo())) {
            return false;
        }
        map.put(produto.getCodigo(), produto);
        return true;
    }

    @Override
    public Produto consultar(Integer codigo) {
        return map.get(codigo);
    }

    @Override
    public Boolean atualizar(Produto produto) {
        if (!map.containsKey(produto.getCodigo())) {
            return false;
        }
        map.put(produto.getCodigo(), produto);
        return true;
    }

    @Override
    public Boolean excluir(Integer codigo) {
        return map.remove(codigo) != null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return map.values();
    }

    public static class ClienteDAO implements IClienteDAO {

        private Map<Long, br.com.rpires.domain.Cliente> map = new HashMap<>();

        @Override
        public Boolean cadastrar(br.com.rpires.domain.Cliente cliente) {
            if (map.containsKey(cliente.getId())) return false;
            map.put(cliente.getId(), cliente);
            return true;
        }

        @Override
        public br.com.rpires.domain.Cliente consultar(Long id) {
            return map.get(id);
        }

        @Override
        public Boolean atualizar(br.com.rpires.domain.Cliente cliente) {
            if (!map.containsKey(cliente.getId())) return false;
            map.put(cliente.getId(), cliente);
            return true;
        }

        @Override
        public Boolean excluir(Long id) {
            return map.remove(id) != null;
        }

        @Override
        public Collection<br.com.rpires.domain.Cliente> buscarTodos() {
            return map.values();
        }
    }
}
