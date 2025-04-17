package br.senac.Faculdade.entities;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity(name = "Alunos")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RA")
    private int ra;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Cep")
    private String cep;

    @Column(name = "numero")
    private int numero;

    @Column(name = "Complemento")
    private String complemneto;

    @Column(name = "notaAdo1")
    private double notaAdo1;

    @Column(name = "notaPI")
    private double notaPI;

    @Column(name = "Data de Cadastro")
    private Date dataCadastro;

    @Column(name = "Status aluno")
    private boolean ativo = true;

    public Aluno() {

    }

    public Aluno(String nome, String cep, int numero, String complemneto, double notaAdo1, double notaPI,Date dataCadastro, boolean ativo) {
        this.nome = nome;
        this.cep = cep;
        this.numero = numero;
        this.complemneto = complemneto;
        this.notaAdo1 = notaAdo1;
        this.notaPI = notaPI;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemneto() {
        return complemneto;
    }

    public void setComplemneto(String complemneto) {
        this.complemneto = complemneto;
    }

    public double getNotaAdo1() {
        return notaAdo1;
    }

    public void setNotaAdo1(double notaAdo1) {
        this.notaAdo1 = notaAdo1;
    }

    public double getNotaPI() {
        return notaPI;
    }

    public void setNotaPI(double notaPI) {
        this.notaPI = notaPI;
    }
}