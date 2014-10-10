package br.com.sip.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Roberto
 */
@Entity
@Table(name = "Pessoa")

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID", nullable = false)
    private Integer idPessoa;

    @Column(name = "TIPOPESSOA", length = 1, nullable = false)
    private String TipoPessoa;

    @Column(name = "CNPJCPF", length = 14, nullable = false, unique = true)
    private String CNPJCPF;

    @Column(name = "NOME_RAZAO", length = 100, nullable = false)
    private String NomeRazao;

    @Column(name = "FANTASIA", length = 100, nullable = false)
    private String Fantasia;

    @Column(name = "SITUACAO", length = 1, nullable = false)
    private String Situacao;
    
    @Column(name = "ORIGEM", length = 20, nullable = true)
    private String Origem;
    
}
