package fiap.com.br.main;

import javax.swing.*;

public class ManipulaString {
    public static void main(String[] args) {
        String frase = "o rato roeu a roupa do rei de Roma";
        JOptionPane.showMessageDialog(null, frase.length());
        JOptionPane.showMessageDialog(null, frase.toUpperCase());
        JOptionPane.showMessageDialog(null, frase.substring(30, 34));
        JOptionPane.showMessageDialog(null, frase.replace("roupa","sapato"));


    }
}
