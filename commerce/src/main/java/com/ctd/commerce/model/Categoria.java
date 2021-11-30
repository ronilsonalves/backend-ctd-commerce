package com.ctd.commerce.model;

<<<<<<< HEAD
import javax.persistence.*;import javax.validation.constraints.Size;
=======
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
>>>>>>> a9ca61d76086e247e9fed9e03a100b9de1ccd123
import java.util.List;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
<<<<<<< HEAD

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produto;


=======
>>>>>>> a9ca61d76086e247e9fed9e03a100b9de1ccd123
    @Size(min = 4, max = 50)
    private String nome;
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}
