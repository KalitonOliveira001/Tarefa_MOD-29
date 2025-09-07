//package br.rpires.domain;

//public class Produto {
  //  private Long codigo;
    //private String nome;
    //private String descricao;
    //private Double valor;

   // public Produto() {
    ///}

    ///public Produto(Long codigo, String nome, String descricao, Double valor) {
       /// this.codigo = codigo;
        ///this.nome = nome;
        ///this.descricao = descricao;
        ////this.valor = valor;
    ///}

    ///public Long getCodigo() {
       //// return codigo;
    ///}

    ///public void setCodigo(Long codigo) {
       /// this.codigo = codigo;
    ///}

    ///public String getNome() {
       // return nome;
    ///}

    //public void setNome(String nome) {
      //  this.nome = nome;
    //}

    //public String getDescricao() {
      //  return descricao;
    //}

    //public void setDescricao(String descricao) {
      //  this.descricao = descricao;
    //}

   // public Double getValor() {
     //   return valor;
   // }
//
    // public void setValor(Double valor) {
      //  this.valor = valor;
    //}

    //@Override
    //public String toString() {
     //   return "Produto{codigo=" + codigo + ", nome='" + nome + "', descricao='" + descricao + "', valor=" + valor + "}";
   // }

 //   }
package br.com.rpires.domain;

public class Produto {
    private Integer codigo;
    private String nome;
    private String descricao;
    private Double valor;

    public Produto(Integer codigo, String nome, String descricao, Double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{codigo=" + codigo + ", nome='" + nome + "', descricao='" + descricao + "', valor=" + valor + "}";
    }
}
