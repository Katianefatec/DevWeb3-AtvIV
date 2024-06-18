package com.autobots.automanager.entidades;
import com.autobots.automanager.enumeracoes.PermissaoEnum;
import javax.persistence.*;


@Entity
@Table(name = "PERMISSAO")
public class Permissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PermissaoEnum nome;

    public Permissao() {}

    public Permissao(PermissaoEnum nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PermissaoEnum getNome() {
        return nome;
    }

    public void setNome(PermissaoEnum nome) {
        this.nome = nome;
    }
}
