package br.inatel.c06.pcmania.computador;

public class SistemaOperacional
{
    //atributos
    private String nome;
    private int tipo;

    //construtor
    public SistemaOperacional(String nome, int tipo)
    {
        this.nome = nome;
        this.tipo = tipo;
    }

    //getters
    public String getNome()
    {
        return nome;
    }

    public int getTipo()
    {
        return tipo;
    }
}
