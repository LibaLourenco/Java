package fiap.com.br.bean;

import javax.swing.*;

public class Adicao {

    //atributos

    private int numInteiro1;
    private int numInteiro2;
    private double numReal1;
    private double numReal2;

    //construtores
    public Adicao() {
    }

    // getters e setters
    public int getNumInteiro1() {
        return numInteiro1;
    }

    public void setNumInteiro1(int numInteiro1) {
        this.numInteiro1 = numInteiro1;
    }

    public int getNumInteiro2() {
        return numInteiro2;
    }

    public void setNumInteiro2(int numInteiro2) {
        this.numInteiro2 = numInteiro2;
    }

    public double getNumReal1() {
        return numReal1;
    }

    public void setNumReal1(double numReal1) {
        this.numReal1 = numReal1;
    }

    public double getNumReal2() {
        return numReal2;
    }

    public void setNumReal2(double numReal2) {
        this.numReal2 = numReal2;
    }

    //metodos da classe (patriculares)

    public int soma(int numInteiro1, int numInteiro2){
        setNumInteiro1(numInteiro1);
        setNumInteiro2(numInteiro2);
        int soma = this.numInteiro1 + this.numInteiro2;
        JOptionPane.showMessageDialog(null,String.format("a soma dos números é: %.f", soma));
        return soma;
    }

    public double soma (double numReal1, double numReal2) {
        setNumReal1(numReal1);
        setNumReal1(numReal2);
        double soma = this.numReal1 + this.numReal2;
        JOptionPane.showMessageDialog(null,String.format("a soma dos números é: %.2f", soma));
        return soma;
    }

}
