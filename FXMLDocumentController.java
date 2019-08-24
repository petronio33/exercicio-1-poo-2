/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1poo2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Petrônio
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    private TextField TFNumero;
    private TextField TFDobro;
    private TextField TFTriplo;
    private TextField TFQuadrado;
    private TextField TFCubo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    private void Calcular(ActionEvent event) {
        
        //Pegar número
        double CNum = Double.parseDouble(TFNumero.getText());
        
        //Dobro
        TFDobro.setText(Double.toString(CNum * 2));
        
        //Triplo
        TFTriplo.setText(Double.toString(CNum * 3));
        
        //Quadrado
        TFQuadrado.setText(Double.toString(Math.pow(CNum, 2)));
        
        //Cubo
        TFCubo.setText(Double.toString(Math.pow(CNum, 3)));
        
    }
    
}