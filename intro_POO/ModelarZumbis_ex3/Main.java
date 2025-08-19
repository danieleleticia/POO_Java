package ModelarZumbis_ex3;

public class Main
{
    public static void main(String[] args)
    {
        Zumbis z = new Zumbis();
        Zumbis z2 = new Zumbis();

        z.nome = "Oswaldo";
        z.vida = 50;
        System.out.println(z.mostraVida());

        z2.nome = "Oswaldo";
        z2.vida = 80;
        System.out.println(z2.mostraVida());

        z.transfereVida(z2,20);
        System.out.println(z.mostraVida());
        System.out.println(z2.mostraVida());

        z = z2;

        System.out.println(z.mostraVida());
        z.transfereVida(z2,30);
        System.out.println(z.mostraVida());
        z2.transfereVida(z,10);
        System.out.println(z2.mostraVida());
    }
}
