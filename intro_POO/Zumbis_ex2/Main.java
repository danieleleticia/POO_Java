package Zumbis_ex2;

public class Main
{
    public static void main(String[] args)
    {
        Zumbi z = new Zumbi();
        Zumbi z2 = new Zumbi();

        z.nome = "Oswaldo";
        z.vida = 50;
        System.out.println(z.mostraVida());

        z2.nome = "Oswaldo";
        z2.vida = 80;
        System.out.println(z2.mostraVida());

        z.transfereVida(z2,20);
        System.out.println(z.mostraVida());
        System.out.println(z2.mostraVida());

    }
}
