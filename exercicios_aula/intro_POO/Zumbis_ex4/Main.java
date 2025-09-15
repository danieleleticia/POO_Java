package Zumbis_ex4;

import Zumbis_ex2.Zumbi;

public class Main
{
    public static void main(String[] args)
    {
        Zumbi_modificado z = new Zumbi_modificado();
        Zumbi_modificado z2 = new Zumbi_modificado();

        z.nome = "Oswaldo";
        z.vida = 80;
        System.out.println(z.mostraVida());

        z2.nome = "Oswaldo";
        z2.vida = 70;
        System.out.println(z2.mostraVida());

        if(z.transfereVida(z2,20))
        {
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println("Vida de z1" +  z.mostraVida());
            System.out.println("Vida de z2" +  z2.mostraVida());
        }
        else
        {
            System.out.println("Não posso fazer essa transferencia, não tenho vida suficiente!" + "Vida: " + z.mostraVida());
        }

        if(z.transfereVida(z,10))
        {
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println("Vida de z1" +  z.mostraVida());
            System.out.println("Vida de z2" +  z2.mostraVida());
        }
        else
        {
            System.out.println("Não posso fazer essa transferencia, não tenho vida suficiente!" + "Vida: " + z.mostraVida());
        }

    }
}
