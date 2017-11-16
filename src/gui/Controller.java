package gui;

import java.net.URL;
import java.util.ResourceBundle;

import domain.Ampellogik;
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

    //Methoden

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonWeiter.setOnAction(event -> {
            Ampellogik.weiter();
        }
    );

    //---------------------------------------------
    // Start
    //---------------------------------------------
    // Code wird ausgeführt,
    // wenn Fenster und Steuerelemente bereit sind

        rotAn();
        gelbAus();
        gruenAus();
}


    public void rotAn() {
        circleRot.setFill(Color.RED);
    }

    public void rotAus() {
        circleRot.setFill(Color.GRAY);
    }

public void gelbAn() {
        circleGelb.setFill(Color.YELLOW);
    }

    public void gelbAus() {
        circleGelb.setFill(Color.GRAY);
    }

    public void grueAn() {
        circleGruen.setFill(Color.GREEN);
    }

    public void gruenAus() {
        circleGruen.setFill(Color.GRAY);
    }

}