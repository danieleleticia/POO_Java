package ModelarZumbis_ex3;

import Zumbis_ex2.Zumbi;

public class Zumbis
{
        //atributos
        double vida;
        String nome;

        //metodos
        double mostraVida()
        {
            return vida;
        }

        void transfereVida(Zumbis zumbiAlvo, double quantia)
        {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
        }

}
