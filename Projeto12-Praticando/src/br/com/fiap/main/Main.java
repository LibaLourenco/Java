package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Gestante gravida1;
        String nome, data1, dataBrasil;
        LocalDate dataDaGestacao;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{

            nome= JOptionPane.showInputDialog("Digite seu nome:");
            data1 = JOptionPane.showInputDialog("Digite inicio da gestação(dia/mês/ano)");

            dataDaGestacao = LocalDate.parse(data1, dtf);
            gravida1 = new Gestante(nome, dataDaGestacao);

            JOptionPane.showMessageDialog(null, gravida1.getDataDaGestacao());

            dataBrasil = gravida1.getDataDaGestacao().format(dtf);
            JOptionPane.showMessageDialog(null, String.format("Exibindo informações\nNome: %s \nData de gestação: %s\nTempo de gestação: %d mês(es)", gravida1.getNome(), dataBrasil, gravida1.tempoDeGestacacao()));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
