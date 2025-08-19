package Jogo_ex5;

public class Arma
{
    //atributos
    String nome, descricao;
    int poder, resistencia;

    //metodos
    void mostraInfoArma()
    {
        System.out.println("Nome da arma: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Descricao: " + descricao);
    }

}
