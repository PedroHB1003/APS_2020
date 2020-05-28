/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;


public class GreenController implements Initializable {

    private int Result = 0;
    private int ResultCount = 0;
    
    private int resultParticular = 0;
    private int resultPublico = 0;
    private int resultCasa = 0;
    private int resultAereas = 0;
    private int resultDieta = 0;
    
    
    // Menu lateral,botões e painéis
    @FXML
    private Pane pnl_particular;
    @FXML
    private Pane pnl_publico;
    @FXML
    private Pane pnl_aereas;
    @FXML
    private Pane pnl_dieta;
    @FXML
    private Pane pnl_casa;
    @FXML
    private Button btn_casa;
    @FXML
    private Button btn_particular;
    @FXML
    private Button btn_publico;
    @FXML
    private Button btn_aereas;
    @FXML
    private Button btn_dieta;    
    @FXML
    private TextField txtResult;
 
    @FXML
    private void btnAction (ActionEvent event) {
	if (event.getSource() == btn_casa) {
	    pnl_casa.toFront();
	}
	else 
	if (event.getSource() == btn_particular) {
	    pnl_particular.toFront();
	}
	else 
	if (event.getSource() == btn_publico) {
	    pnl_publico.toFront();
	}
	else 
	if (event.getSource() == btn_aereas) {
	    pnl_aereas.toFront();
	}
	else 
	if (event.getSource() == btn_dieta) {
	    pnl_dieta.toFront();
	}
	
	/* Pane Transporte Particular, botão adicionar ao resultado total
	else
	if (event.getSource() == btnAdcParticular) {
	    if (combustivelChooser.getSelectionModel().getSelectedItem() == "Gasolina" && ResultCount != 1) {
		
		Result = 2.3 * txtQulometragem.getValue();
		Result += 1;
		ResultCount = 1;
		
		
		txtResult.setText("" + Result);
	    }
	}
	*/
    }
    
    // Painel Transporte Particular
    @FXML
    private ChoiceBox combustivelChooser;
    ObservableList combustivelChooserList = FXCollections.observableArrayList("Gasolina","Diesel","Biodiesel");
    
    @FXML
    private Button btnAdcParticular;
    
    @FXML
    private TextField txtQulometragem;
    

    
    
    // Forçar TextFields para ser apenas Numéricos
    public class NumberTextField extends TextField
    {

	@Override
	public void replaceText(int start, int end, String text)
	{
	    if (validate(text))
	    {
		super.replaceText(start, end, text);
	    }
	}

	@Override
	public void replaceSelection(String text)
	{
	    if (validate(text))
	    {
		super.replaceSelection(text);
	    }
	}

	private boolean validate(String text)
	{
	    return text.matches("[0-9]*");
	}
    }
    
    /*public particular(Result) {
	Result += 2.3 * txtQulometragem.getValue();
    }
    */

    //
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	// TODO
	
	combustivelChooser.setValue("Gasolina");
	combustivelChooser.setItems(combustivelChooserList);
	
	/*
	Result = ()
	txtResult.setText("" + Result);
	*/
    }    
    
}
