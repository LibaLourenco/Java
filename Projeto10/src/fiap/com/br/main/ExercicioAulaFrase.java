package fiap.com.br.main;

import javax.swing.*;

public class ExercicioAulaFrase {
    public static void main(String[] args) {
        String frase = "Comi chocolate demais na Páscoa";
        JOptionPane.showMessageDialog(null, frase);
        JOptionPane.showMessageDialog(null, frase.length());
        JOptionPane.showMessageDialog(null, frase.toUpperCase());

        String palavraTroca = JOptionPane.showInputDialog("Escolha uma palavra para ser trocada na frase: ");
        String palavraNova = JOptionPane.showInputDialog("Agora digite a nova palavra para aparecer na frase: ");

        JOptionPane.showMessageDialog(null, frase.replace(palavraTroca,palavraNova));

        String novaFrase = frase.replace(palavraTroca,palavraNova);

        JOptionPane.showMessageDialog(null, novaFrase.length());


    }
}
