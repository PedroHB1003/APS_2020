package GUI;

import Entities.EmissionFactors;
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
import javafx.scene.layout.Pane;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;


public class GreenController implements Initializable {

    private double result = 0;
    
    private double resultParticular = 0;
    private double resultPublico = 0;
    private double resultCasa = 0;
    private double resultDieta = 0;
    
    
    
    // Menu lateral,botões e painéis
    @FXML
    private Pane pnl_particular;
    @FXML
    private Pane pnl_publico;
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
    private Button btn_dieta;
    @FXML
    private Button btnCalcular;    
    @FXML
    private TextField txtResult;
    @FXML
    private Button btnReset;

    @FXML
    private void btnAction (ActionEvent event) {
	//Botões menu
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
	if (event.getSource() == btn_dieta) {
	    pnl_dieta.toFront();
	}
	
	
	
	//Botões Calcular total e reset
	if (event.getSource() == btnCalcular) {
	    result = resultParticular + resultPublico + resultCasa + resultDieta;
	    String strResult = String.format("%.4f", result);
	    txtResult.setText(strResult);
	}
	if (event.getSource() == btnReset) {
	    result = 0;
	    resultParticular = 0;
	    resultPublico = 0;
	    resultCasa = 0;
	    resultDieta = 0;
	    
	    txtResult.setText("");
	}
	
	
	
	// Pane Casa
	if (event.getSource() == btnResultCasa) {
	    double consumoEletrico;
	    double consumoGas;
	    int numeroPessoas;
	    
	    String str1 = txtEletricCasa.getText();
	    if (str1.matches("[0.00-9.99]+") || str1.contains(",")) {
		str1 = str1.replaceAll(",", ".");
		consumoEletrico = Double.parseDouble(str1);
	    } else {
		txtEletricCasa.setText("0.0");
		consumoEletrico = 0.0;
	    }
	    
	    String str2 = txtGasCasa.getText();
	    if (str2.matches("[0.00-9.99]+") || str2.contains(","))  {
		str2 = str2.replaceAll(",", ".");
		consumoGas = Double.parseDouble(str2);
	    } else {
		txtGasCasa.setText("0.0");
		consumoGas = 0.0;
	    }
		
	    String str0 = txtPessoasCasa.getText();
	    if (str0 == "0" || str0.contains("-") || str0.matches("[a-z]+") || str0.matches("[A-Z]+") || str0.contains("")) {
		txtPessoasCasa.setText("1");
		numeroPessoas = 1;
	    } else {
		numeroPessoas = Integer.parseInt(str0);
	    }
	    
	    resultCasa = ((consumoEletrico * 12 * EmissionFactors.ELETRICITY)/ numeroPessoas) + ((consumoGas * 12 * EmissionFactors.NATURAL_GAS)/ numeroPessoas);
	    
	    String str1Double = String.format("%.2f", resultCasa);
	    lblResultCasa.setText(str1Double + " KG de CO2 por ano");
	}
	
	

	// Pane Transporte Particular
	if (event.getSource() == btnResultParti) {
	    double distance;
	    
	    String str = txtDistance.getText();
	    if (str.matches("[0.00-9.99]+") || str.contains(","))  {
		str = str.replaceAll(",", ".");
		distance = Double.parseDouble(str);
	    } else {
		txtDistance.setText("0.0");
		distance = 0.0;
	    }
	    
	    
	    if (combustivelChooser.getSelectionModel().getSelectedItem() == "Gasolina") {
		resultParticular = distance * EmissionFactors.GASOLINE * 12;
	    }
	    else if (combustivelChooser.getSelectionModel().getSelectedItem() == "Diesel") {
		resultParticular = distance * EmissionFactors.DIESEL * 12;
	    }
	    else if (combustivelChooser.getSelectionModel().getSelectedItem() == "Biodiesel") {
		resultParticular = distance * EmissionFactors.BIODIESEL * 12;
	    }
	    
	    String strDouble = String.format("%.2f", resultParticular);
	    lblResultParti.setText(strDouble + " KG de CO2 por ano");
	}
	
	
	
	// Pane Transporte Público
	if (event.getSource() == btnResultPublico) {
	    double distancePublic;
	    double resultPublico = 0.0;
	    
	    String str3 = txtPublico.getText();
	    if (str3.matches("[0.00-9.99]+") || str3.contains(","))  {
		str3 = str3.replaceAll(",", ".");
		distancePublic = Double.parseDouble(str3);
	    } else {
		txtPublico.setText("0.0");
		distancePublic = 0.0;
	    }
	    
	    if (publicoChooser.getSelectionModel().getSelectedItem() == "Ônibus") {
		resultPublico = (distancePublic * EmissionFactors.GASOLINE * 12)/20;
	    }
	    else if (publicoChooser.getSelectionModel().getSelectedItem() == "Metrô") {
		resultPublico = (distancePublic * EmissionFactors.ELETRICITY * 12)/150;
	    }
	    
	    String str3Double = String.format("%.2f", resultPublico);
	    lblResultPublico.setText(str3Double + " KG de CO2 por ano");
	}
	
	
	
	if (event.getSource() == btnResultDieta) {
	    if (radioDieta1.isSelected()) {
		resultDieta = 12 * 36.5;
	    } else if (radioDieta2.isSelected()) {
		resultDieta = 12 * 50.2;
	    } else if (radioDieta3.isSelected()) {
		resultDieta = 12 * 7.8;
	    }
	    
	    String str4Double = String.format("%.2f", resultDieta);
	    lblResultDieta.setText(str4Double + " KG de CO2 por ano");
	}
    }

    
    // Interface Casa
    @FXML
    private Label lblResultCasa;
    @FXML
    private Button btnResultCasa;
    @FXML
    private TextField txtEletricCasa;
    @FXML
    private TextField txtGasCasa;
    @FXML
    private TextField txtPessoasCasa;

    // Interface Transporte Particular
    @FXML
    private ChoiceBox combustivelChooser;
    ObservableList combustivelChooserList = FXCollections.observableArrayList("Gasolina","Diesel","Biodiesel");
    @FXML
    private Button btnResultParti;
    @FXML
    private Label lblResultParti;
    @FXML
    private TextField txtDistance;

    // Interface Transporte Público
    @FXML
    private ChoiceBox publicoChooser;
    ObservableList publicoChooserList = FXCollections.observableArrayList("Ônibus","Metrô");
    @FXML
    private TextField txtPublico;
    @FXML
    private Label lblResultPublico;
    @FXML
    private Button btnResultPublico;
    
    // Interface Dieta
    @FXML
    private Button btnResultDieta;
    @FXML
    private Label lblResultDieta;
    @FXML
    private RadioButton radioDieta1, radioDieta2, radioDieta3;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	//Pane Transporte particular, setando informações
	combustivelChooser.setValue("Gasolina");
	combustivelChooser.setItems(combustivelChooserList);
	
	//Pane Transporte público, setando informações
	publicoChooser.setValue("Ônibus");
	publicoChooser.setItems(publicoChooserList);	
    }    
} 