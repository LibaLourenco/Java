package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    private String nome;
    private LocalDate dataDaGestacao;
    public Gestante(){

    }
    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        setDataDaGestacao(dataDaGestacao); // alterar por set

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        try {

               LocalDate dataAtual = LocalDate.now();
               Period periodo = Period.between(dataDaGestacao, dataAtual);
               int ano = periodo.getYears();
               int meses = periodo.getMonths();

              if(ano == 0 && meses <=9 ) {
                     this.dataDaGestacao = dataDaGestacao;
              } else {
                    throw new Exception("Data Inválida!");
              }

       } catch (Exception e)     {
        JOptionPane.showMessageDialog(null, e.getMessage());
        System.exit(0);
       }
}


// metodos particulares
    public int tempoDeGestacacao() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between( dataDaGestacao, dataAtual);
        return periodo.getMonths();

    }
}










