
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

class Controller implements Initializable {

    //---------------------------------------------
    // Membervariablen für Steuerelemente
    //---------------------------------------------        
    @FXML
    private Circle circleRot;

    @FXML
    private Circle circleGelb;

    @FXML
    private Circle circleGruen;

    @FXML
    private Button buttonWeiter;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonWeiter.setOnAction(event -> {

        });

        //---------------------------------------------
        // Start
        //---------------------------------------------
        // Code wird ausgeführt,
        // wenn Fenster und Steuerelemente bereit sind
        circleRot.setFill(Color.RED);
    }
}
