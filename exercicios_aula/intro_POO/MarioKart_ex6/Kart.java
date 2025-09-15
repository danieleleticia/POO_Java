package MarioKart_ex6;

public class Kart
{
    //atributos
    String nome;
    Motor motor;
    Piloto piloto;

    //construtor
    public Kart()
    {
        motor = new Motor();
    }

    //metodos
    void pular()
    {
        System.out.println("O Kart pulou");
    }
    void soltarTurbo()
    {
        System.out.println("O Kart usou o Turbo");
    }
    void fazerDrift()
    {
        System.out.println("O Kart acaba de fazer um Drift");
    }
}
