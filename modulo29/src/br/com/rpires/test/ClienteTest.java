package br.com.rpires.test;

import br.com.rpires.dao.ClienteDAO;
import br.com.rpires.dao.IClienteDAO;
import br.com.rpires.domain.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        IClienteDAO dao = new ClienteDAO();

        System.out.println("=== TESTANDO CLIENTE ===");

        Cliente cliente1 = new Cliente(1L, "João Silva", "12345678901");
        Cliente cliente2 = new Cliente(2L, "Maria Souza", "98765432100");

        System.out.println("Cadastrando dados...");
        dao.cadastrar(cliente1);
        dao.cadastrar(cliente2);

        System.out.println("Consultando dados...");
        System.out.println(dao.consultar(1L));

        cliente1.setNome("João Silva (Atualizado)");
        dao.atualizar(cliente1);

        System.out.println("Total de clientes: " + dao.buscarTodos().size());

        for (Cliente c : dao.buscarTodos()) {
            System.out.println(c);
        }

        dao.excluir(2L);
        System.out.println("Após exclusão, total: " + dao.buscarTodos().size());
    }
}