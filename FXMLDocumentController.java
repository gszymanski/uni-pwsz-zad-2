import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Random;

public class FXMLDocumentController implements Initializable {
	@FXML private AnchorPane anchorPane;
	@FXML private Button button;

	public void initialize(URL url, ResourceBundle rb) {
		button.setOnMouseMoved(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				Random random = new Random();
				button.setLayoutX(random.nextInt(420));
				button.setLayoutY(random.nextInt(470));
			}
		});
	}

	@FXML
	private void buttonClick(ActionEvent event) {
		System.exit(0);
	}
}
