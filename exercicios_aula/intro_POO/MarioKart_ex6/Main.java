package MarioKart_ex6;

public class Main
{
    public static void main(String[] args)
    {
        Piloto piloto = new Piloto();
        Piloto piloto2 = new Piloto();

        Kart kart = new Kart();
        Kart kart2 = new Kart();

        kart.piloto = piloto;
        kart2.piloto = piloto2;

        piloto.nome = "Oswaldo";
        piloto.vilao = true;

        piloto2.nome = "Gilmar";
        piloto2.vilao = false;

        kart.piloto.soltaSuperPoder();
        kart2.piloto.soltaSuperPoder();

        kart.motor.cilindradas = "150";
        kart.motor.velocidadeMaxima = 30;
        kart.motor.mostraInfo();

        piloto.nome = "mamau";
        System.out.println(kart.piloto.nome);

    }
}
