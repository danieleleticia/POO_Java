package br.inatel.c06.pcmania.computador;

public class HardwareBasico
{
    //atributos
    private String nome;
    private float capacidade;

    //construtor
    public HardwareBasico(String nome, float capacidade)
    {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //getters
    public String getNome()
    {
        return nome;
    }

    public float getCapacidade()
    {
        return capacidade;
    }
}
