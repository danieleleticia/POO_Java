package Jogo_ex5;

public class Main
{
    public static void main(String[] args)
    {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        personagem.minha_arma = arma;

        arma.nome = "AK47";
        arma.resistencia = 120;

        arma.mostraInfoArma();

        personagem.pontos = 200;

        personagem.tomarDano();
        personagem.usarArma();

        personagem.minha_arma.mostraInfoArma();
    }
}
