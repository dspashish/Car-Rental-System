/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_car_rental;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private TextField requireddays;

    @FXML
    private RadioButton dcar;

    @FXML
    private RadioButton sdcar;

    @FXML
    private RadioButton ocar;

    @FXML
    private CheckBox guide;

    @FXML
    private Label amount;

    @FXML
    private Label gcharge;

    @FXML
    private Label totalamount;
    
    @FXML
    private void radiobuttons(ActionEvent event){
        if(dcar.isSelected()){
            sdcar.selectedProperty().set(false);
            ocar.selectedProperty().set(false);
        } else if(sdcar.isSelected()){
            dcar.selectedProperty().set(false);
            ocar.selectedProperty().set(false);
        }  else if(ocar.isSelected()){
            sdcar.selectedProperty().set(false);
            dcar.selectedProperty().set(false);
        }
    }
    
    @FXML
    private void clear(ActionEvent event){
        name.setText("");
        phone.setText("");
        requireddays.setText("");
        dcar.selectedProperty().set(false);
        sdcar.selectedProperty().set(false);
        ocar.selectedProperty().set(false);
        guide.selectedProperty().set(false);
        
    }
    
    @FXML
    private void close(ActionEvent event){
        System.exit(0);
    }
    
    @FXML
    private void calculate(ActionEvent event){       
       
        int days = Integer.parseInt(requireddays.getText());
        int guidCharge = 40;
        int total_amount;
        int dprize = 1000 * days; 
        int sdprize = 800 * days;
        int oprize = 700 * days;
        if(dcar.isSelected()){
            
            if(guide.isSelected()){
                total_amount = dprize + guidCharge; 
                amount.setText(""+dprize);
                gcharge.setText("40");
                totalamount.setText(""+total_amount);
            } else {
                total_amount = dprize;     
                amount.setText(""+dprize);
                gcharge.setText("No Guide Required");
                totalamount.setText(""+total_amount);
            }
            

                    
        }
        
        if(sdcar.isSelected()){
            
            if(guide.isSelected()){
                total_amount = sdprize + guidCharge; 
                amount.setText(""+sdprize);
                gcharge.setText("40");
                totalamount.setText(""+total_amount);
            } else {
                total_amount = sdprize;     
                amount.setText(""+sdprize);
                gcharge.setText("No Guide Required");
                totalamount.setText(""+total_amount);
            }
            

                    
        }
        
        if(ocar.isSelected()){
            
            if(guide.isSelected()){
                total_amount = oprize + guidCharge; 
                amount.setText(""+oprize);
                gcharge.setText("40");
                totalamount.setText(""+total_amount);
            } else {
                total_amount = oprize;     
                amount.setText(""+oprize);
                gcharge.setText("No Guide Required");
                totalamount.setText(""+total_amount);
            }
            

                    
        }
        
        
        
        
        
        
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
