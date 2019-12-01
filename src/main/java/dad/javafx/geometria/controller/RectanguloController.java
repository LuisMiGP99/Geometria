package dad.javafx.geometria.controller;

import dad.javafx.geometria.model.RectanguloModel;
import dad.javafx.geometria.view.RectanguloView;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {
	
	private RectanguloModel model = new RectanguloModel();
	private RectanguloView root = new RectanguloView();
	
	public RectanguloController() {
		root.anchoText.textProperty().bindBidirectional(model.anchoProperty(), new NumberStringConverter());
		root.altoText.textProperty().bindBidirectional(model.altoProperty(), new NumberStringConverter());
		root.areaLabel.textProperty().bind(model.areaProperty().asString());
		root.rectangulo.widthProperty().bind(model.anchoProperty());
		root.rectangulo.heightProperty().bind(model.altoProperty());
	}
}
