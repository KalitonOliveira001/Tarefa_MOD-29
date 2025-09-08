Projeto modulo29 - Padrão DAO em Java

 
Este projeto implementa um CRUD completo utilizando o **padrão DAO (Data Access Object)** em Java.  
Foram criadas duas entidades principais:

Cliente
Produto

Cada entidade possui sua interface e classe DAO, contendo os métodos básicos de persistência em memória (utilizando `HashMap`).
Cada DAO contém os seguintes métodos:

 `cadastrar`  adiciona um objeto novo.  
 `consultar`  busca um objeto pelo seu identificador (CPF ou código).  
 `atualizar` altera dados de um objeto existente.  
 `buscarTodos`  retorna todos os objetos cadastrados.  
 `excluir` remove um objeto pelo seu identificador.  
