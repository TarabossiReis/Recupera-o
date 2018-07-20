/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


/**
 *
 * @author 03828184235
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txtResultado;
    @FXML
    private TextField txt1;
    
    @FXML
    private void soma (ActionEvent event) {
        Double n1, n2, res;
        n1 = Double.parseDouble(txt1.getText());
        n2 = Double.parseDouble(txt2.getText());
        
        res = n1 + n2;
        txtResultado.setText(res.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void subtracao(ActionEvent event) {
        Double n1, n2, res;
        n1 = Double.parseDouble(txt1.getText());
        n2 = Double.parseDouble(txt2.getText());
        
        res = n1 - n2;
        txtResultado.setText(res.toString());
    }

    @FXML
    private void divisao(ActionEvent event) {
        Double n1, n2, res;
        n1 = Double.parseDouble(txt1.getText());
        n2 = Double.parseDouble(txt2.getText());
        
        res = (n1/n2);
        txtResultado.setText(res.toString());
    }

    @FXML
    private void mitiplicacao(ActionEvent event) {
        Double n1, n2, res;
        n1 = Double.parseDouble(txt1.getText());
        n2 = Double.parseDouble(txt2.getText());
        
        res = n1 * n2;
        txtResultado.setText(res.toString());
    }
    
}
