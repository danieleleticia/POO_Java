package br.inatel.c06.pcmania.computador;

public class Computador
{
    //atributos
    private String marca;
    private float preco;
    private SistemaOperacional so;
    private HardwareBasico[] hardware = new HardwareBasico[3]; //array
    private MemoriaUSB memoria;

    //construtor
    public Computador(String marca, float preco, String nome, int tipo)
    {
        this.marca = marca;
        this.preco = preco;
        so = new SistemaOperacional(nome, tipo);
    }
//metodos

    public float getPreco()
    {
        return preco;
    }

    public void addHardware(String nome, float capacidade)
    {
        for(int i = 0; i < hardware.length; i++)
        {
            if(hardware[i] == null)
            {
                hardware[i] = new HardwareBasico(nome, capacidade);
                break;
            }

        }

    }

    public void addMemoriaUSB(MemoriaUSB musb) //agregação
    {
        memoria = musb;
    }

    public void mostraPCConfigs()
    {
        System.out.println("\nEspecificações do PC adquirido:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + (int)this.preco);

        for(HardwareBasico aux : hardware)
        {
            if(aux != null)
            {
                if(aux.getNome().contains("Core"))
                {
                    System.out.println(aux.getNome() + " (" + (int)aux.getCapacidade() + " Mhz)");
                }
                else
                {
                    System.out.println(aux.getNome() + " (" + (int)aux.getCapacidade() + " Gb)");
                }
            }
        }
        System.out.println("Sistema Operacional: " + so.getNome() + " (" +  so.getTipo() + ")"+ " bits");
        if(memoria != null)
        {
            System.out.println("Acompanha: " + memoria.getNome() + " " + memoria.getCapacidade() + " Gb");
        }
    }
}
