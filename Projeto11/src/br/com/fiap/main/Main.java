package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1;
        String auxiliar, nome, dataEUA;
        LocalDate dataNascimento;

        try {
            nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
            auxiliar = JOptionPane.showInputDialog("Digite a data de nascimento (dia/mês/ano");
            //arrumando a String no formato ano-mês-dia
            //  0 1 2 3 4 5 6 7 8 9 - posições no indice
            //  2 1 / 1 1 / 2 0 0 0 - data a ser revisada
            String ano = auxiliar.substring(6, 10);
            String mes = auxiliar.substring(3, 5);
            String dia = auxiliar.substring(0, 2);
            dataEUA = ano + "-" + mes + "-" + dia;
            dataNascimento = LocalDate.parse(dataEUA);
            pessoa1 = new Pessoa(nome, dataNascimento);
            JOptionPane.showMessageDialog(null, String.format("Data formato EUA\nData de nascimento: %s", pessoa1.getDataNascimento()));
            //formatando a data no padrao dia-mes-ano
            DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            JOptionPane.showMessageDialog(null, String.format("Dados pessoais\nNome: %s\nData de Nascimento: %s\nIdade: %d ano(s)", pessoa1.getNome(), pessoa1.getDataNascimento().format(dft), pessoa1.calcularIdade()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
   }
}
