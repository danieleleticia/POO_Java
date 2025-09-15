package Jogo_ex5;

public class Personagem
{
    //atributos
    String nome;
    int pontos;
    Arma minha_arma;
    //metodos

    void tomarDano()
    {
        int dano = 5;
        pontos -= dano;
    }

    void usarArma()
    {
        int quebrando = 2;
        minha_arma.resistencia -= quebrando;
    }
}
