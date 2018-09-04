package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable{
	  @FXML
	    private Button btn5;

	    @FXML
	    private Button btn8;

	    @FXML
	    private Button btn4;

	    @FXML
	    private Button btnMul;

	    @FXML
	    private Button btn9;

	    @FXML
	    private Button btnInv;

	    @FXML
	    private Button btnSub;

	    @FXML
	    private Button btn0;

	    @FXML
	    private Button btnAdd;

	    @FXML
	    private Button btnSqrd;

	    @FXML
	    private Button btn3;

	    @FXML
	    private Button btn2;

	    @FXML
	    private Button btn1;

	    @FXML
	    private Button btnDiv;

	    @FXML
	    private Button btn6;

	    @FXML
	    private Button btn7;

	    @FXML
	    private TextField txtNumerator1;

	    @FXML
	    private TextField txtDenominator1;

	    @FXML
	    private TextField txtNumerator2;

	    @FXML
	    private TextField txtResultN;

	    @FXML
	    private TextField txtResultD;
	    
	    @FXML
	    private TextField txtOperation;
	    
	    private boolean selectNum1;
	    
	    private boolean selectDen1;
	    
	    private boolean selectNum2;
	    
	    private boolean selectDen2;

	public CalculatorController() {
		// TODO Auto-generated constructor stub
		selectNum1 = true;
		selectDen1 = false;
		selectNum2 = false;
		selectDen2 = false;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btn7 = new Button();
		
	}
	
	@FXML
	void num1(ActionEvent event) {
//		System.out.println(":)");

	}
	
	@FXML
    void numberPressed(ActionEvent event) {
		
		String value = ((Button) event.getSource()).getText();
//		System.out.println(txtOperation.getText().length()+"e");
		
		if (txtOperation.getText().length() == 0) {
			if (value.equals("0")) {
				txtNumerator1.appendText("0");
			}
			else if (value.equals("1")) {
				txtNumerator1.appendText("1");				
			}
			else if (value.equals("2")) {
				txtNumerator1.appendText("2");
			}
			else if (value.equals("3")) {
				txtNumerator1.appendText("3");
			}
			else if (value.equals("4")) {
				txtNumerator1.appendText("4");
			}
			else if (value.equals("5")) {
				txtNumerator1.appendText("5");
			}
			else if (value.equals("6")) {
				txtNumerator1.appendText("6");
			}
			else if (value.equals("7")) {
				txtNumerator1.appendText("7");
			}
			else if (value.equals("8")) {
				txtNumerator1.appendText("8");
			}
			else if (value.equals("9")) {
				txtNumerator1.appendText("9");
			}
			
		}
		
		
		
		
		
    }

}
