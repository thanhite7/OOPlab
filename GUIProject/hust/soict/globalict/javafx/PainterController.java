package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class PainterController {

	private int check  =0;
	@FXML
	private Pane drawingAreaPane;
	@FXML
	private RadioButton pen,eraser;
	@FXML
	void clearButtonPressed(ActionEvent event) {
		drawingAreaPane.getChildren().clear();
	}
	@FXML
	void AreaMouseDragged(MouseEvent event) {
		
		if(check==1)
		{
			Circle newCicleCircle = new Circle(event.getX(),event.getY(),3,Color.BLACK);
			drawingAreaPane.getChildren().add(newCicleCircle);
		}
		if(check==0)
		{
			Circle newCicleCircle = new Circle(event.getX(),event.getY(),30,Color.WHITE);
			drawingAreaPane.getChildren().add(newCicleCircle);
		}
	}
	
	@FXML
	void choosepen(ActionEvent event)
	{
		if (pen.isSelected())
		{
			check=1;
		}
		else if(eraser.isSelected())
		{
			check = 0;

		}
	}
	
}