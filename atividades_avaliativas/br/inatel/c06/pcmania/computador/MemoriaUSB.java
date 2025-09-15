package br.inatel.c06.pcmania.computador;

public class MemoriaUSB
{
    //atributos
    private String nome;
    private int capacidade;

    //construtor
    public MemoriaUSB(String nome, int capacidade)
    {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome()
    {
        return nome;
    }

    public int getCapacidade()
    {
        return capacidade;
    }
}
