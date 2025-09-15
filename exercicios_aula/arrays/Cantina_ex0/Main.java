package Cantina_ex0;

public class Main
{
    public static void main(String[] args)
    {
        Cantina cantina = new Cantina();
        Salgado salgado = new Salgado();
        Salgado salgado1 = new Salgado();

        cantina.nome =  "Cantina da Neide";

        salgado.nome = "Coxinha";
        salgado1.nome = "Enroladinho de Salsicha";

        cantina.addSalgado(salgado);
        cantina.addSalgado(salgado1);
        cantina.mostraInfo();

    }
}
