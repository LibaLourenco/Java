package fiap.com.br.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExercicioAulaData {
    public static void main(String[] args) {
       LocalDate dataInicial = LocalDate.parse(JOptionPane.showInputDialog("Entre a data inicial: "));
       LocalDate dataFinal = LocalDate.parse(JOptionPane.showInputDialog("Entre a data final: "));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Period periodo = Period.between(dataFinal, dataInicial);


    }
}
