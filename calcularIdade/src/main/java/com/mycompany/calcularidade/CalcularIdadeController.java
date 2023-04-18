package com.mycompany.calcularidade;

import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class CalcularIdadeController implements Initializable {

    @FXML
    private Label anoAtual;

    @FXML
    private Label idadeLabel;

    @FXML
    private Spinner<Integer> JSpinner;

    /**
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);
        this.anoAtual.setText(Integer.toString(ano));
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(2023, ano, 2023);
        this.JSpinner.setValueFactory(valueFactory);
    }

    @FXML
    public void calculaIdade() {
        try {
            int anoNascimento = JSpinner.getValue();
            Calendar calendario = Calendar.getInstance();
            int atualmente = calendario.get(Calendar.YEAR);
            int idade = atualmente - anoNascimento;
            idadeLabel.setText(Integer.toString(idade));
        } catch (NullPointerException e) {
            idadeLabel.setText("Valor inválido"); 
        }
    }
}
