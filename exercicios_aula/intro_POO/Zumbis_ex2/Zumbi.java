package Zumbis_ex2;

public class Zumbi
{
    //atributos
    double vida;
    String nome;

    //metodos
    double mostraVida()
    {
        return vida;
    }
    void transfereVida(Zumbi zumbiAlvo, double quantia)
    {
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

}
