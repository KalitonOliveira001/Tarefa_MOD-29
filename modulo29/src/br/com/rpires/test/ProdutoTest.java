//package br.com.rpires.test;

//import br.com.rpires.dao.ProdutoDAO;
//import br.com.rpires.dao.IProdutoDAO;
//import br.rpires.domain.Produto;

//import java.util.Collection;

//public class ProdutoTest {

  //  public static void main(String[] args) {
    //    IProdutoDAO produtoDAO = new ProdutoDAO();

      //  System.out.println("=== TESTANDO PRODUTO ===");

      //  Produto produto1 = new Produto(1L, "Notebook", "Notebook Gamer", 2500.00);
      //  System.out.println("Cadastrando: " + produtoDAO.cadastrar(produto1));

        ///Produto produto2 = new Produto(2L, "Mouse", "Mouse Gamer RGB", 150.00);
        ///System.out.println("Cadastrando: " + produtoDAO.cadastrar(produto2));

        ////System.out.println("Consultando Notebook: " + produtoDAO.consultar(1L));

        ///Collection<Produto> todos = produtoDAO.buscarTodos();
       /// System.out.println("Total de produtos: " + todos.size());


    ///    System.out.println("Excluindo: " + produtoDAO.excluir(1L));

      ///  System.out.println("=== TESTE PRODUTO CONCLUÍDO ===");
  //  }
//}
//System.out.println("Listando todos os produtos:");
//for (Produto p : dao.buscarTodos()) {
//        System.out.println(p);
//}
package br.com.rpires.test;

import br.com.rpires.dao.IProdutoDAO;
import br.com.rpires.dao.ProdutoDAO;
import br.com.rpires.domain.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        IProdutoDAO dao = new ProdutoDAO();

        System.out.println("=== TESTANDO PRODUTO ===");

        Produto produto1 = new Produto(1, "Notebook", "Notebook Gamer", 2500.0);
        Produto produto2 = new Produto(2, "Mouse", "Mouse sem fio", 150.0);

        System.out.println("Cadastrando: " + dao.cadastrar(produto1));
        System.out.println("Cadastrando: " + dao.cadastrar(produto2));

        System.out.println("Consultando Notebook: " + dao.consultar(1));

        System.out.println("Total de produtos: " + dao.buscarTodos().size());

        produto1.setValor(2600.0);
        System.out.println("Atualizando: " + dao.atualizar(produto1));

        System.out.println("Listando todos os produtos:");
        for (Produto p : dao.buscarTodos()) {
            System.out.println(p);
        }

        System.out.println("Excluindo: " + dao.excluir(1));

        System.out.println("=== TESTE PRODUTO CONCLUÍDO ===");
    }
}
