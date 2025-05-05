package fiap.com.br.main;

import fiap.com.br.bean.Geometria;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        Geometria geo = new Geometria();
        String auxiliar, escolha = "sim";
        int opcao;
        float lado, altura;
        double raio;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular?\n(1) Quadrado\n(2) Retangulo\n(3) Círculo");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {

                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor de lado");
                        lado = Float.parseFloat(auxiliar);
                        geo.calcularArea(lado);
                        break;

                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor de lado");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o valor da altura");
                        altura = Float.parseFloat(auxiliar);
                        geo.calcularArea(lado, altura);
                        break;

                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do raio");
                        raio = Float.parseFloat(auxiliar);
                        geo.calcularArea(raio);
                        break;

                    default:
                        throw new Exception ("Escolha Incorreta!");
                }

                escolha = JOptionPane.showInputDialog("Deseja continuar?");
                    
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa. Volte Sempre!");

    }
}
