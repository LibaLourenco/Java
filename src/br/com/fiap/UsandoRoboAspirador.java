package br.com.fiap;

public class UsandoRoboAspirador {
    public static void main(String[] args) {
        //declaração de objeto e instanciação juntos
        RoboAspirador roboAspirador = new RoboAspirador();
        roboAspirador.potencia = 1;
        roboAspirador.modo = "Aspirar";

        roboAspirador.aumentarPotencia();
        roboAspirador.aumentarPotencia();
        roboAspirador.trocarModo("Passar Pano");

        System.out.println("Potencia atual: "+roboAspirador.potencia+"\nModo atual: "+roboAspirador.modo);

    }
}
