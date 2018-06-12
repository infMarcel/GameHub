
/**
 * Sample Skeleton for 'SI.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.event.ActionEvent;

public class ControllerSp1 {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="highsclist"
    private ListView<?> highsclist; // Value injected by FXMLLoader

    @FXML // fx:id="startbtn"
    private Button startbtn; // Value injected by FXMLLoader

    @FXML // fx:id="bckbtn"
    private Button bckbtn; // Value injected by FXMLLoader
    @FXML
    private Text nametxt;
    @FXML // fx:id="desctxt"
    private Text desctxt; // Value injected by FXMLLoader
    private Spiel sp;
    private Stage stage;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert highsclist != null : "fx:id=\"highsclist\" was not injected: check your FXML file 'SI.fxml'.";
        assert startbtn != null : "fx:id=\"startbtn\" was not injected: check your FXML file 'SI.fxml'.";
        assert bckbtn != null : "fx:id=\"bckbtn\" was not injected: check your FXML file 'SI.fxml'.";
        assert desctxt != null : "fx:id=\"desctxt\" was not injected: check your FXML file 'SI.fxml'.";
        
        bckbtn.setOnMouseReleased(e-> { 
        try{FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
        Parent root = loader.load();
        Controller contr = loader.getController();
        contr.setStage(stage);

        // Fenster erstellen und anzeigen
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);}
        catch(IOException ex){
            ex.printStackTrace();
        }
    });
        
    }
    public void setSpiel(Spiel sp_ ){
        //Updaten des Spieles und der Textfelder
        sp = sp_;
        desctxt.setText(sp.getBESCH());
        nametxt.setText(sp.getName());
    }
    public void setStage(Stage s){
        stage = s;
    }
    
    
    @FXML public void start(ActionEvent event)
    {
        sp.start();
    }
}
