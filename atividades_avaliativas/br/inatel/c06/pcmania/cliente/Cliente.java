package br.inatel.c06.pcmania.cliente;

import br.inatel.c06.pcmania.computador.Computador;

public class Cliente
{
    //atributos
    private String nome;
    private String cpf;
    private Computador[] computadores = new Computador[10];

    //construtor
    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    //getters e setters
    public String getNome()
    {
        return nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public Computador[] getComputadores()
    {
        return computadores;
    }

    public void setComputadores(Computador[] computadores)
    {
        this.computadores = computadores;
    }

    //metodos
    public float calculaTotalCompra()
    {
        float totalCompra = 0;
        for(Computador computador : computadores)
        {
            if(computador != null)
            {
                totalCompra += computador.getPreco();
            }
        }
        return totalCompra;
    }
}
