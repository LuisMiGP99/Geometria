package dad.javafx.geometria.view;

import dad.javafx.geometria.shapes.Hexagon;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HexagonoView extends VBox {
	public Label anchoLabel,areaLabel,altoLabel,perimLabel;
	public TextField anchoText,altoText;
	public Hexagon hexagono;
	
	public HexagonoView() {
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
		
		hexagono= new Hexagon();
		hexagono.setRadius(40);
		hexagono.setFill(Color.GREEN);
		hexagono.setStrokeWidth(2);
		hexagono.setStroke(Color.BLACK);
		
		this.getChildren().addAll(anchoBox,altoBox,hexagono,areaLabel,perimLabel);
		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
	}
}
