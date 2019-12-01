package dad.javafx.geometria.view;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class TrianguloView extends VBox {
	public Label anchoLabel,areaLabel,altoLabel,perimLabel;
	public TextField anchoText,altoText;
	public Triangle triangulo;
	
	public TrianguloView() {
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
		
		triangulo= new Triangle(80,60);
		triangulo.setFill(Color.GREEN);
		triangulo.setStrokeWidth(2);
		triangulo.setStroke(Color.BLACK);
		
		this.getChildren().addAll(anchoBox,altoBox,triangulo,areaLabel,perimLabel);
		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
	}
}
