package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor1; // declaração de objeto
        televisor1 = new Televisor(); //instanciação
        televisor1.volume = 10;
        televisor1.canal = 12;
        televisor1.aumentarVolume();
        televisor1.aumentarVolume();
        televisor1.trocarCanal(18);
        System.out.println("Volume atual: "+televisor1.volume+"\nCanal atual: "+ televisor1.canal);

    }
}
