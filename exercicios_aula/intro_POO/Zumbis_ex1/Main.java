package Zumbis_ex1;

public class Main
{
    public static void main(String[] args)
    {
        Zumbi zumbi = new Zumbi();

        zumbi.nome = "Jose";
        zumbi.vida = 50;
        System.out.println(zumbi.valorVida());

        zumbi.comerCerebros();
        System.out.println(zumbi.valorVida());

        zumbi.atormentar();
        zumbi.mostrarInfo();
        zumbi.atormentar();
    }
}
