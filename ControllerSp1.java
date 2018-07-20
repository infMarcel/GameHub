
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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import java.util.*;

public class ControllerSp1 {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Button startbtn;
    @FXML
    private Button bckbtn;
    @FXML
    private Text desctxt;
    @FXML
    private Text nametxt;
    @FXML
    private Label score1;
    @FXML
    private Label player1;
    @FXML
    private Label player3;
    @FXML
    private Label player2;
    @FXML
    private Label player4;
    @FXML
    private Label player5;
    @FXML
    private Label player6;
    @FXML
    private Label player0;
    @FXML
    private Label player7;
    @FXML
    private Label player8;
    @FXML
    private Label player9;
    @FXML
    private Label score0;
    @FXML
    private Label score2;
    @FXML
    private Label score3;
    @FXML
    private Label score4;
    @FXML
    private Label score5;
    @FXML
    private Label score6;
    @FXML
    private Label score7;
    @FXML
    private Label score8;
    @FXML
    private Label score9;
    @FXML
    private Button playbtn;    
    private Spiel sp;
    private Stage stage;
    private ArrayList<Label> scores;
    private ArrayList<Label> players;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
       
        assert startbtn != null : "fx:id=\"startbtn\" was not injected: check your FXML file 'SI.fxml'.";
        assert bckbtn != null : "fx:id=\"bckbtn\" was not injected: check your FXML file 'SI.fxml'.";
        assert desctxt != null : "fx:id=\"desctxt\" was not injected: check your FXML file 'SI.fxml'.";
        scores = new ArrayList<Label>();
        players = new ArrayList<Label>();
        scores.add(score0);
        scores.add(score1);
        scores.add(score2);
        scores.add(score3);
        scores.add(score4);
        scores.add(score5);
        scores.add(score6);
        scores.add(score7);
        scores.add(score8);
        scores.add(score9);
        players.add(player0);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
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
        for(int a = 0 ; a<= 9 ; a++){
            scores.get(a).setText(""+sp.getScore(a));
            players.get(a).setText(sp.getName(a));
        }
               
   }
    public void setStage(Stage s){
        stage = s;
    }
    
    
    @FXML public void start(ActionEvent event)
    {
        sp.start();
    }
}
