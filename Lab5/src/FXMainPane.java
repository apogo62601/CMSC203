import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button Hello;
	Button Howdy;
	Button Chinese;
	Button Clear;
	Button Exit;
	
	Label Feedback;
	
	TextField Type;
	
	//  declare two HBoxes
	HBox hbox;
	HBox hbox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager Data_manager;

	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		Hello = new Button("Hello");
		Howdy = new Button("Howdy");
		Chinese = new Button("Chinese");
		Clear = new Button("Clear");
		Exit = new Button("Exit");
		
		Feedback = new Label("Feedback");
		
		Type = new TextField();
		
		//  instantiate the HBoxes
		hbox = new HBox(); // spacing = 3
		hbox2 = new HBox(); // spacing = 3
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		Data_manager = new DataManager();
		
		ButtonHandler buttonhandler = new ButtonHandler();
		
		Hello.setOnAction(buttonhandler);
		Howdy.setOnAction(buttonhandler);
		Chinese.setOnAction(buttonhandler);
		Clear.setOnAction(buttonhandler);
		Exit.setOnAction(buttonhandler);
		 
		Insets insets = new Insets(5);
		//  set margins and set alignment of the components
		HBox.setMargin(Hello, insets);
		HBox.setMargin(Howdy, insets);
		HBox.setMargin(Chinese, insets);
		HBox.setMargin(Clear, insets);
		HBox.setMargin(Exit, insets);
		
		hbox.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hbox.getChildren().addAll(Feedback, Type);
		//  add the buttons to the other HBox
		hbox2.getChildren().addAll(Hello);
		hbox2.getChildren().addAll(Howdy);
		hbox2.getChildren().addAll(Chinese);
		hbox2.getChildren().addAll(Clear);
		hbox2.getChildren().addAll(Exit);
		//  add the HBoxes to this FXMainPanel (a VBox)
		this.getChildren().addAll(hbox, hbox2);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {

		public void handle(ActionEvent event) {
			if (event.getTarget().equals(Hello)) {
				Type.setText(Data_manager.getHello());
			}
			else if (event.getTarget().equals(Howdy)) {
				Type.setText(Data_manager.getHowdy());
			}
			else if (event.getTarget().equals(Chinese)) {
				Type.setText(Data_manager.getChinese());
			}
			else if (event.getTarget().equals(Clear)) {
				Type.setText("");
			}
			else if (event.getTarget().equals(Exit)) {
				Platform.exit();
			}
			
		}
		
		
	}
	}
	