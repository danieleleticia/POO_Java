package Cantina_ex0;

public class Cantina
{
    //atributos
    String nome;
    Salgado[] salgados = new Salgado[10];

    //metodos
    public void addSalgado(Salgado novoSalgado)
    {
        for(int i = 0; i < salgados.length; i++)
        {
            if(salgados[i] == null)
            {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo()
    {
        System.out.println("Nome da Cantina: " + nome);

        for(Salgado salgado : salgados)
        {
            if(salgado != null)
                System.out.println(salgado.nome);
        }
    }
}
