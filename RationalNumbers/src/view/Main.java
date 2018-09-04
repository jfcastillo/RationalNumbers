package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import numericSystem.IRationalNumber;
import numericSystem.RationalNumber;

public class Main extends Application{

	public Main() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/calculatorView.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		RationalNumber<Number> a = new RationalNumber<Number>(1, 2);
		RationalNumber<Number> b = new RationalNumber<Number>(6, 4);
//		a.addRational(b);
		a.squaredRational();
		b.squaredRational();
		System.out.println(a.getNumerator());
		System.out.println(a.getDenominator());
		System.out.println(b.getNumerator());
		System.out.println(b.getDenominator());
		launch(args);
		
		
	}

}
