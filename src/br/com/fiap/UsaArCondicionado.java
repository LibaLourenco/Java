package br.com.fiap;

public class UsaArCondicionado {
    public static void main(String[] args) {
        //declaração de objetos e instanciação juntos
        ArCondicionado arCondicionado1 = new ArCondicionado();
        String modo = "Ventilar";

        arCondicionado1.temperatura = 18;
        arCondicionado1.modo = "resfriar";
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.trocarModo ("Ventilar");

      System.out.println("Temperatura atual: "+arCondicionado1.temperatura+"\nModo Atual: "+arCondicionado1.modo);

    }
}
