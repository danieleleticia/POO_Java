package Zumbis_ex1;

import java.util.Random;

public class Zumbi
{
    //atributos
    String nome;
    int vida;

    //metodos
     void comerCerebros() //comer cerebros aumenta a vida
     {
         vida += 10;
     }
      int valorVida()
     {
         return vida;
     }
     void atormentar()
     {
         Random rand = new Random(); //gerando número aleatorio
         int x = rand.nextInt(2);

         if(x == 0) //0 é noite
            System.out.println("Hora de atormentar");
        else //1 é dia
            System.out.println("Hora de descansar");
     }
     void mostrarInfo()
     {
         System.out.println(nome);
         System.out.println(vida);
     }
}
