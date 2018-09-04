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
		RationalNumber<Number> c;
		RationalNumber<Number> d;
		RationalNumber<Number> e;
		c = new RationalNumber<Number>(-13, 23);
		d = new RationalNumber<Number>(-100, 28);
		e = new RationalNumber<Number>(0, 1);

		a.rationalInverse();
		b.rationalInverse();
		c.rationalInverse();
		d.rationalInverse();
		e.rationalInverse();
		System.out.println(a.getNumerator() +" "+a.getDenominator());
		System.out.println(b.getNumerator()+" "+b.getDenominator());
		System.out.println(c.getNumerator()+" "+c.getDenominator());
		System.out.println(d.getNumerator()+" "+d.getDenominator());
		System.out.println(e.getNumerator()+" "+e.getDenominator());
		
		launch(args);
		
		
	}

}
