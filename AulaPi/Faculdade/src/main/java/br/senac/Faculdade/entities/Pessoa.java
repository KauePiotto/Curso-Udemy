package br.senac.Faculdade.entities;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity(name = "Pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nascimento")
    private Date dataNaci;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String email, String cpf, Date dataNaci) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNaci = dataNaci;
    }

    public Pessoa(String nome, String email, String cpf, Date dataNaci) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNaci = dataNaci;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNaci() {
        return dataNaci;
    }

    public void setDataNaci(Date dataNaci) {
        this.dataNaci = dataNaci;
    }
}