package dad.javafx.geometria.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class RectanguloView extends VBox{
	
	public Label anchoLabel,areaLabel,altoLabel,perimLabel;
	public TextField anchoText,altoText;
	public Rectangle rectangulo;
	
	public RectanguloView() {
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
		
		rectangulo= new Rectangle();
		rectangulo.setHeight(60);
		rectangulo.setWidth(80);
		rectangulo.setFill(Color.rgb(0, 162, 232));
		rectangulo.setStrokeWidth(2);
		rectangulo.setStroke(Color.BLACK);
		
		this.getChildren().addAll(anchoBox,altoBox,rectangulo,areaLabel,perimLabel);
		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
	}
	
}
