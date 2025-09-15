package Zumbis_ex4;

import Zumbis_ex2.Zumbi;

public class Zumbi_modificado
{
    //atributos
    double vida;
    String nome;

    //metodos
    double mostraVida()
    {
        return vida;
    }
    boolean transfereVida(Zumbi_modificado zumbiAlvo, double quantia)
    {
        if(vida > quantia)
        {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else
        {
            return false;
        }

    }
}
