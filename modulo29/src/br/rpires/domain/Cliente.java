package br.com.rpires.domain;

public class Cliente {
    private Long id;
    private String nome;
    private String cpf; // String!

    public Cliente() {}

    public Cliente(Long id, String nome, String cpf) { // id, nome, cpf
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "', cpf='" + cpf + "'}";
    }
}

///package br.com.rpires.domain;

///public class Cliente {
   /// private Long cpf;
    ///private String nome;

   /// public Cliente(Long cpf, String nome) {
      ///  this.cpf = cpf;
       /// this.nome = nome;
    ///}

   /// public Long getCpf() {
       /// return cpf;
    ///}

    ///public void setCpf(Long cpf) {
      ///  this.cpf = cpf;
    ///}

    ///public String getNome() {
       /// return nome;
    ///}

   /// public void setNome(String nome) {
      ///  this.nome = nome;
    ///}

    ///@Override
    ///public String toString() {
      ///  return "Cliente{cpf=" + cpf + ", nome='" + nome + "'}";
    ///}

    ///public static class Cliente {
     ///   private Long cpf;
        ///private String nome;

       /// public Cliente() {
        ///}

        ///public Cliente(String nome, Long cpf) {
           /// this.nome = nome;
            ///this.cpf = cpf;
        ///}

        ///public Long getCpf() {
           /// return cpf;
        ///}

        ///public void setCpf(Long cpf) {
          ///  this.cpf = cpf;
        ///}

        ///public String getNome() {
          ///  return nome;
        ///}

        ///public void setNome(String nome) {
           /// this.nome = nome;
        ///}

        ///@Override
        ///public String toString() {
           /// return "br.rpires.domain.Produto.Cliente{cpf=" + cpf + ", nome='" + nome + "'}";
        ///}
    ///}
///}
