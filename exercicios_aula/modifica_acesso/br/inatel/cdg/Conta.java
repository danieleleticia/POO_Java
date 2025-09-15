package br.inatel.cdg;

public class Conta
{
    //atributos
    private int num;
    private float saldo;
    private float limite;
    Cliente [] clientes = new Cliente[3];

    public float getSaldo()
    {
        return saldo;
    }

    public int getNum()
    {
        return num;
    }

    //metodos
    public void sacar(float quantia)
    {
        if(this.saldo >= quantia)
            this.saldo -= quantia;
    }
    public void deposita(float quantia)
    {
        this.saldo += quantia;
    }

    //construtor
    public Conta()
    {
        for(int i = 0; i < clientes.length; i++)
        {
            clientes[i] = new Cliente();
        }
    }

}
