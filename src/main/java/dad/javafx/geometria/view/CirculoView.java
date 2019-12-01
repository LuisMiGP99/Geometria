package dad.javafx.geometria.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends VBox{
	public Label anchoLabel,areaLabel,altoLabel,perimLabel;
	public TextField anchoText,altoText;
	public Circle circulo;
	
	public CirculoView() {
		super();
		anchoLabel= new Label("Ancho: ");
		altoLabel= new Label("Alto: ");
		areaLabel = new Label("Área: XXX");
		perimLabel = new Label("Perímetro: XXX");
		
		HBox anchoBox = new HBox(anchoLabel,anchoText);
		anchoBox.setSpacing(5);
		anchoBox.setAlignment(Pos.CENTER);
		
		HBox altoBox = new HBox(altoLabel,altoText);
		altoBox.setSpacing(5);
		altoBox.setAlignment(Pos.CENTER);
		
		circulo= new Circle();
		circulo.setRadius(40);
		circulo.setFill(Color.RED);
		circulo.setStrokeWidth(2);
		circulo.setStroke(Color.BLACK);
		
		this.getChildren().addAll(anchoBox,altoBox,circulo,areaLabel,perimLabel);
		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
	}
}
